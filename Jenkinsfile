def podSpec = """
apiVersion: v1
kind: Pod
metadata:
  labels:
    flexci: ci-pod
    app: qa-regression
spec:
  containers:
  - name: docker
    image: registry.flexshopper.xyz:5000/docker
    command:
    - cat
    env:
    - name: DOCKER_HOST
      value: "tcp://localhost:2375"
    tty: true
  - name: dind-daemon
    image: docker:18.06.1-dind
    resources:
        requests:
            cpu: 40m
            memory: 1024Mi
    securityContext:
        privileged: true
    volumeMounts:
      - name: docker-graph-storage
        mountPath: /var/lib/docker
  volumes:
  - name: docker-graph-storage
    emptyDir: {}
  imagePullSecrets:
  - name: regcred-gitlab
"""

def label = "flexci-executor-auto-qa-mp-" + UUID.randomUUID().toString()

podTemplate(label: label,
        yaml: podSpec,
        cloud: 'huachuca'
) {
    node(label) {
        container("docker") {
            stage("Install") {
                checkout scm
            }

            stage('Clone Repository') {
                checkout([$class: 'GitSCM', branches: [[name: '*/development']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-ci-user', url: 'https://github.com/FlexShopper/qa-regression.git']]])
                sh "ls -lart ./*"
               dir(WORKSPACE + '/qa-regression/') {
                   sh "pwd"
               }
            }

            stage("Run PP3 Tests on FlexShopper Staging") {
                docker.image("registry.flexshopper.xyz:5000/selenium-jenkins-runner-chrome-latest").inside {
                    withCredentials([string(credentialsId: 'slack-api-token', variable: 'SLACK_TOKEN')]) {
                        ansiColor('gnome-terminal') {
                            echo 'Install Java JDK'
                            sh """
                                apt-get update && \
                                apt-get install -y openjdk-8-jdk && \
                                apt-get install -y ant && \
                                apt-get clean;
                                """
                            sh "export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64"
                            sh "java -version"
                           if (fileExists('./mvnw')) {
                                echo 'File mvnw found!'
                                echo 'Running automation with Maven wrapper'
                                sh "java -version"
                                sh "chmod -R 777 ./mvnw"
                                sh "./mvnw clean install"
                           }
                           else {
                                echo 'File mvnw Not found'
                                echo 'Installing Maven'
                                sh "apt-get install maven -y"
                                sh "mvn -v"
                                sh "export MAVEN_HOME=/usr/share/maven"
                                sh "export M2_HOME=/home/maven/"
                                sh "mvn clean install -Dcucumber.options=\"--tags @Email\""
                           }
                        }
                    }
                }
            }

            stage ('Send Email') {
                echo "Mail Stage";
                     mail to: "antonio.navas@flexshopper.com",
                     cc: 'antonio_navas40@hotmail.com', charset: 'UTF-8',
                     from: 'DoNotReply@flexshopper.com', mimeType: 'text/html', replyTo: '',
                     bcc: '',
                     subject: "CI: Project name -> ${env.JOB_NAME}",
                     body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}";
            }
        }
    }
}