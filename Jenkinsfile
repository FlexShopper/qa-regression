pipeline {
    agent any // use any available agent in Jenkins

    stages {
        stage('Pull latest Docker image') {
            steps {
                sh 'docker pull selenium/standalone-chrome:latest'
            }
        }
        stage('Run PP3 Tests on FlexShopper Staging') {
            steps {
                sh """
                source ~/.bash_profile
                 mvn clean test
                 """
            }
        }
        stage('Tear down') {
            steps {
                sh 'docker-compose down' // bring the docker containers down
            }
        }
    }
}