pipeline {
    agent any
    stages {
        stage('checkout scm') {
            steps {
                echo 'pulling code from git repository'
            }
        }
        stage('build') {
            steps {
                echo 'building project using maven'
            }
        }
    }
}