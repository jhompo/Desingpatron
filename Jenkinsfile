pipeline {
    agent any

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
        
        // stage('SonarQube Analysis') {
        //     environment {
        //         SCANNER_HOME = tool 'SonarScanner'  // Asegúrate de que este nombre coincida con tu instalación de SonarScanner en Jenkins
        //     }
        //     steps {
        //         withSonarQubeEnv('SonarQubeServer') {
        //            sh """
        //                 ${SCANNER_HOME}/bin/sonar-scanner \
        //                 -Dsonar.projectKey=Devops-proyects-00001jx \
        //                 -Dsonar.sources=src \
        //                 -Dsonar.java.binaries=bin \
        //                 -Dsonar.host.url=http://sonarqube:9000 \
        //                 -Dsonar.login=squ_d5c424dd35b187b5154a63ce5cb036cf869c8f97
        //             """
        //         }
        //     }
        // }

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
                    credentialsId: 'login-nexus',
                    artifacts: [
                        [artifactId: 'my-java-app', 
                        classifier: '', 
                        file: 'target/my-app.jar', 
                        type: 'jar']
                    ]
                )
            }
        }

        stage('Ejecutar Playbook de Ansible') {
            steps {
                script {
                    // Ejecutar Ansible desde el contenedor de Ansible
                    sh "docker exec ${env.JAVA_HOME} ansible-playbook /playbook.yml -i /hosts"
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