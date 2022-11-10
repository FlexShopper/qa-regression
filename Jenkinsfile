pipeline {
    agent any // use any available agent in Jenkins
    stages {
        stage('Clone Repository') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/development']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-ci-user', url: 'https://github.com/FlexShopper/qa-regression.git']]])
                sh "ls -lart ./*"
            }
        }
        stage('Pull latest Docker image') {
            steps {
                sh 'docker pull registry.flexshopper.xyz:5000/docker'
            }
        }
        stage('Install Chrome in Jenkins Instance') {
            steps {
                sh 'wget https://dl.google.com/linux/direct/google-chrome-stable_current_x86_64.rpm'
                sh "yum install ./google-chrome-stable_current_*.rpm"
                sh "google-chrome &"
            }
        }
        stage('Run PP3 Tests on FlexShopper Staging') {
            steps{
                dir(WORKSPACE + '/qa-regression/') {
                    sh "pwd"
                }
                script {
                    if (fileExists('./mvnw')) {
                        echo 'File mvnw found!'
                        sh "java -version"
                        sh "chmod -R 777 ./mvnw"
                        sh "./mvnw clean install"
                    }
                    else {
                        echo 'File mvnw Not found'
                        sh "ls -lart ./*"
                    }
                }
            }
        }
    }
}