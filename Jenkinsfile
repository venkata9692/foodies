pipeline {
    agent any
    stages{
        stage('checkout scm') {
            step {
                echo 'pulling code from git repository'
            }
        }
        stage('build') {
            step {
                echo 'building project using maven'
            }
        }
    }
}