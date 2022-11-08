pipeline {
    agent any // use any available agent in Jenkins

    stages {
        stage('Run PP3 Tests on FlexShopper Staging') {
            steps {
                sh """
                source ~/.bash_profile
                 mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
                 """
            }
        }
    }
}