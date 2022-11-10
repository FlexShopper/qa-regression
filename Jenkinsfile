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
                dir(WORKSPACE + '/qa-regression/maven/bin/') {
                    sh "pwd"
                }
                sh "/per_CI_qa-regression_development/qa-regression/maven/bin/mvn -v"
                dir(WORKSPACE + '/qa-regression/') {
                    sh "mvn help:evaluate -Dexpression=project.groupId -q -DforceStdout"
                }
                sh """
                source ~/.bash_profile
                 /per_CI_qa-regression_development/qa-regression/maven/bin/mvn clean test
                 """
            }
        }
    }
}