pipeline {
    agent any // use any available agent in Jenkins
    stages {
        stage('Clone Repository') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/development']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-ci-user', url: 'https://github.com/FlexShopper/qa-regression.git']]])
                sh "ls -lart ./*"
            }
        }
        stage('Pull latest Selenium Jenkins image & Run PP3 Tests on FlexShopper Staging') {
            steps {
                docker.image("registry.flexshopper.xyz:5000/selenium-jenkins-runner").inside {
                    withCredentials([string(credentialsId: 'slack-api-token', variable: 'SLACK_TOKEN')]) {
                       ansiColor('gnome-terminal') {
                       dir(WORKSPACE + '/qa-regression/') {
                                           sh "pwd"
                       }
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
    }
}