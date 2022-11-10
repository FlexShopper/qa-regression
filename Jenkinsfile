pipeline {
    agent any // use any available agent in Jenkins
    stages {
        stage('Clone Repository') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/development']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-ci-user', url: 'https://github.com/FlexShopper/qa-regression.git']]])
                sh "ls -lart ./*"
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
                        sh "sudo ./mvnw clean install"
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