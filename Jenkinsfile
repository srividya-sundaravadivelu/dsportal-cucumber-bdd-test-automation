pipeline {
    agent any

    tools {
        maven 'Maven_3.9.9'   // Use your Maven tool name configured in Jenkins
        jdk 'jdk-21'          // Use the JDK version you installed and named in Jenkins
        allure 'allure-2.30.0'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/srividya-sundaravadivelu/dsportal-cucumber-bdd-test-automation.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Generate Allure Report') {
            steps {
                allure includeProperties: false,
                       jdk: '',
                       results: [[path: 'target/allure-results']]
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }
        failure {
            mail to: 'srividya18.2002@gmail.com',
                 subject: "Build Failed: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
                 body: "Check Jenkins console for details: ${env.BUILD_URL}"
        }
    }
}
