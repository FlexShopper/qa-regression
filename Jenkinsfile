pipeline {
    agent any // use any available agent in Jenkins
    stages {
        stage('Clone Repository') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/development']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-ci-user', url: 'https://github.com/FlexShopper/qa-regression.git']]])
                sh "ls -lart ./*"
            }
        }
        stage('Pull latest Selenium Jenkins image') {
            steps {
                sh 'registry.flexshopper.xyz:5000/selenium-jenkins-runner'
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