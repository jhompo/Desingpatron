pipeline {
    agent any  // Utiliza cualquier agente disponible

    environment {
        SONARQUBE_SERVER = 'http://sonarqube:9000' // Cambia a la URL de tu servidor SonarQube
        SONARQUBE_TOKEN = credentials('squ_d5c424dd35b187b5154a63ce5cb036cf869c8f97') // Reemplaza con el ID de tus credenciales
    }

    stages {
        stage('Checkout') {
            steps {
                // Clona el repositorio de GitHub
                checkout scm
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
                script {
                    // Ejecuta el análisis de SonarQube
                    sh '''
                        mvn sonar:sonar \
                        -Dsonar.projectKey=Devops-proyects-00001jx \
                        -Dsonar.host.url=${SONARQUBE_SERVER} \
                        -Dsonar.login=${SONARQUBE_TOKEN} \
                        -Dsonar.sources=src \
                        -Dsonar.java.binaries=bin
                    '''
                }
            }
        }
    