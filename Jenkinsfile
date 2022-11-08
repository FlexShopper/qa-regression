pipeline {
    agent {
        node {
            label 'iMac 1'
        }
    }
    stages {
        stage('Run PP3 Tests on FlexShopper Staging') {
            steps {
                sh """
                source ~/.bash_profile
                 mvn clean test
                 """
            }
        }
    }
}