pipeline {
    agent any
    
    // Verifica que exista el JDK con nombre 'JDK-11-jenkins'
    // Verifica que exista el SonarScanner con nombre 'SonarScanner' en tool y 'SonarQubeServer' en system
    // Verificar Credential ID de nexus

    environment {
        JAVA_HOME = '/opt/java/openjdk'
        ANSIBLE = 'ansible'
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    tools {
        jdk 'JDK-11-jenkins'  // Asegúrate de que este nombre coincida con tu instalación de JDK en Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                sh 'ls -la'
            }
        }
        stage('Compilación') {
            steps {
                script {
                    sh '''
                        mkdir -p bin
                        find src -name "*.java" -print | xargs javac -d bin -sourcepath src
                    '''
                }
            }
        }
        stage('Ejecución') {
            steps {
                script {
                    sh 'java -cp bin Main'
                }
            }
        }
        
        stage('SonarQube Analysis') {
            environment {
                SCANNER_HOME = tool 'SonarScanner'  // Asegúrate de que este nombre coincida con tu instalación de SonarScanner en Jenkins
            }
            steps {
                // withSonarQubeEnv('SonarQubeServer') {
                //    sh """
                //         ${SCANNER_HOME}/bin/sonar-scanner \
                //         -Dsonar.projectKey=Devops-proyects-00001jx \
                //         -Dsonar.sources=src \
                //         -Dsonar.java.binaries=bin \
                //         -Dsonar.host.url=http://sonarqube:9000 \
                //         -Dsonar.login=squ_08d56badd6abc114e4e6110cd6487728efd95b42
                //     """
                // }
                echo 'Omitir Sonarube por fast Nexus'
            }
        }

        stage('Crear JAR') {
            steps {
                script {
                    sh '''
                        mkdir -p target
                        jar cvf target/my-app.jar -C bin .
                    '''
                }
            }
        }
        
        stage('Deploy to Nexus') {
            steps {
                nexusArtifactUploader(
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    nexusUrl: 'nexus:8081',
                    groupId: 'com.jhomposoft',
                    version: '1.0-${BUILD_NUMBER}',
                    repository: 'REPO-JAVA',
                    credentialsId: 'id-nexus',
                    artifacts: [
                        [artifactId: 'my-java-app', 
                        classifier: '', 
                        file: 'target/my-app.jar', 
                        type: 'jar']
                    ]
                )
            }
        }

        stage('Preparar Ansible') {
            steps {
                script {
                    // Copiar archivos necesarios al contenedor de Ansible
                    sh """
                        # Asegurarse que el contenedor ansible existe
                        if ! docker ps | grep -q ${env.ANSIBLE}; then
                            echo "Error: Contenedor ansible no encontrado"
                            exit 1
                        fi
                        
                        # Copiar archivos al contenedor
                        docker cp ${WORKSPACE}/ansible/playbook.yml ${env.ANSIBLE}:/playbook.yml
                        docker cp ${WORKSPACE}/ansible/hosts ${env.ANSIBLE}:/hosts
                    """
                }
            }
        }

        stage('Ejecutar Playbook de Ansible') {
            steps {
                script {
                    // Ejecutar Ansible desde el contenedor de Ansible
                    sh "docker exec ${env.ANSIBLE} ansible-playbook /playbook.yml -i /hosts"
                }
                /*Con el plugin
                ansiblePlaybook(
                    playbook: '/ruta/del/playbook.yml',
                    inventory: '/ruta/al/inventario/hosts'
                )*/
            }
        }

        
    }
    post {
        always {
            echo 'Análisis de SonarQube completado.'
        }
    }
}