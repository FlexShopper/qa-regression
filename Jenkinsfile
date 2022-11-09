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
                    if (fileExists('per_CI_qa-regression_development/qa-regression/FlexShopperFramework-1.0-SNAPSHOT-tests.jar')) {
                        echo "File src/main/rersources/index.html found!"
                    }
                    sh "java -jar FlexShopperFramework-1.0-SNAPSHOT-tests.jar"
                }
            }
        }
    }
}