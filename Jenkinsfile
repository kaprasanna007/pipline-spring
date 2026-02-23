pipeline {
    agent any

    tools {
        maven 'Mavan3'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/kaprasanna007/pipline-spring.git'
            }
        }

        tages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
