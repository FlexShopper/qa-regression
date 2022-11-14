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
                docker.image("registry.flexshopper.xyz:5000/selenium-jenkins-runner").inside {
                    withCredentials([string(credentialsId: 'slack-api-token', variable: 'SLACK_TOKEN')]) {
                        ansiColor('gnome-terminal') {
                           if (fileExists('./mvn')) {
                               sh "./mvn -X clean install"
                           }
                           else {
                               echo 'File mvn Not found'
                               sh "apt-get install maven -y"
                               sh "mvn -v"
                               sh "export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64"
                               sh "export MAVEN_HOME=/home/maven/"
                               sh "mvn -e -X clean install"
                           }
                        }
                    }
                }
            }
        }
    }
}