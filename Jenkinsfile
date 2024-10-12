pipeline {
    agent any

    environment {
        JAVA_HOME = '/opt/java/openjdk'
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
                withSonarQubeEnv('SonarQubeServer') {
                    sh '''
                        ${SCANNER_HOME}/bin/sonar-scanner \
                        -Dsonar.projectKey=Devops-proyects-00001jx \
                        -Dsonar.sources=src \
                        -Dsonar.java.binaries=bin
                    '''
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