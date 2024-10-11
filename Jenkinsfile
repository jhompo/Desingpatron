pipeline {
    agent any  // Utiliza cualquier agente disponible

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
                        -Dsonar.host.url=http://sonarqube:9000 \
                        -Dsonar.login=squ_a0fd6f032dc169e3ee44cc8773d2368d3d6d1dca \
                        -Dsonar.sources=src \
                        -Dsonar.java.binaries=bin
                    '''
                }
            }
        }
    }
}
    