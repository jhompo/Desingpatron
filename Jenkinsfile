pipeline {
    agent any  // Utiliza cualquier agente disponible

    environment {
        JAVA_HOME = '/opt/java/openjdk' // Ajusta esta ruta a la instalación de Java en tu servidor
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    tools {
        sonarScanner 'SonarScanner' // Configurado en Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                // Clona el repositorio de GitHub
                checkout scm
                sh 'ls -la'
            }
        }
        stage('Compilación') {
            steps {
                script {
                    // Cambia al directorio del proyecto
                    sh 'cd /var/jenkins_home/workspace/Designpatron'
                    // Crea el directorio bin si no existe y compila los archivos Java
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
                    // Ejecuta la clase principal
                    sh 'java -cp bin Main'
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQubeServer') { // Usar el nombre de tu servidor SonarQube configurado
                    sh 'sonar-scanner \
                        -Dsonar.projectKey=Devops-proyects-00001jx \
                        -Dsonar.host.url=http://sonarqube:9000 \
                        -Dsonar.login=squ_d5c424dd35b187b5154a63ce5cb036cf869c8f97 \
                        -Dsonar.sources=src \
                        -Dsonar.java.binaries=bin'
                }
            }
        }
    }
    post {
        always {
            echo 'Análisis de SonarQube completado.'
        }
    }
}