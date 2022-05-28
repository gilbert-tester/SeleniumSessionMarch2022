pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        
        stages {
        stage('Deply to Dev') {
            steps {
                echo 'dev deployment..'
            }
        } }
        
        
         stages {
        stage('Deply to QA') {
            steps {
                echo ' QA deployment..'
            }
        }
       }
       
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
