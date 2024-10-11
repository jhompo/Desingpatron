pipeline {
    agent any // Utiliza cualquier agente disponible

    environment {
        SONARQUBE_SERVER = 'http://sonarqube:9000' // URL de tu servidor SonarQube
        SONARQUBE_TOKEN = credentials('squ_d5c424dd35b187b5154a63ce5cb036cf869c8f97') // ID de tus credenciales
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'javac -d bin -sourcepath src src/**/*.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java -cp bin Main'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    // Ejecuta el análisis de SonarQube
                    sh '''
                        mvn sonar:sonar -X \
                        -Dsonar.projectKey=Devops-proyects-00001jx \
                        -Dsonar.host.url=${SONARQUBE_SERVER} \
                        -Dsonar.login=${SONARQUBE_TOKEN} \
                        -Dsonar.sources=src \
                        -Dsonar.java.binaries=bin
                    '''
                }
            }
        }
    }
}