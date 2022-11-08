pipeline {
    agent any // use any available agent in Jenkins
    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/development']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-ci-user', url: 'https://github.com/FlexShopper/qa-regression.git']]])
                sh "ls -lart ./*"
            }
        }
        stage('Run PP3 Tests on FlexShopper Staging') {
            steps{
            dir(WORKSPACE + '/' + BuildLocation) {
                sh """
                   cd ''' + WORKSPACE + '''/''' + per_CI_qa-regression_development + '''/''' + qa-regression + '''/''' + builds + '''/''' + libs + '''
                   var=$(find -regex "$App.*.jar" 2>/dev/null)
                   echo "$var"
                   if ! [ -z "$var" ]
                   then
                       echo "JAR file found"
                       java -jar FlexShopperFramework-1.0-SNAPSHOT-tests.jar
                    fi
                """
            }
        }
    }
}