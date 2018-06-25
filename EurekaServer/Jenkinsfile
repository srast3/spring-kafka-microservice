 node {

    withMaven(maven:'maven') {

        stage('Checkout') {
            git url: 'https://github.com/srast3/spring-kafka-microservice.git', credentialsId: '', branch: 'master'
        }

        stage('Build') {
            sh 'mvn clean install'

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }

        stage('Image') {
            dir ('EurekaServer') {
                def app = docker.build "localhost:5000/discovery-service:${env.version}"
                app.push()
            }
        }

        stage ('Run') {
            docker.image("localhost:5000/discovery-service:${env.version}").run('-p 8761:8761 -h discovery-service --name discovery-service')
        }

        stage ('Final') {
            build job: 'config-server-pipeline', wait: false
        }      

    }

}