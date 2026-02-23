pipeline {
    agent any

    tools {
        maven 'Mavan3'  // Must match the Maven name in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/kaprasanna007/pipline-spring.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}
