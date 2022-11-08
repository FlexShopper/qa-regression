pipeline {
    agent any // use any available agent in Jenkins
    tools {
      maven 'Maven 3.3.9'
      jdk 'jdk8'
    }
    stages {
        stage('Clone repo in to Jenkins instance') {
            steps {
                deleteDir()
                checkout scm // checkout and clone our git repo into the Jenkins instance
            }
        }
        stage('Pull latest Docker image') {
            steps {
                sh 'docker pull registry.flexshopper.xyz:5000/docker'
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