pipeline {
    agent any

    tools {
        maven 'Maven_Home'       // Maven tool name configured in Jenkins
        jdk 'my JDK'             // JDK version configured in Jenkins
        allure 'allure'          // Allure commandline tool in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/srividya-sundaravadivelu/dsportal-cucumber-bdd-test-automation.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    catchError(buildResult: 'UNSTABLE', stageResult: 'FAILURE') {
                        bat 'mvn clean test'
                    }
                }
            }
        }

        stage('Generate Allure Report') {
            steps {
                allure([
                    includeProperties: false,
                    jdk: '',
                    results: [[path: 'target/allure-results']]
                ])
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }

        failure {
            mail to: 'srividya18.2002@gmail.com',
                 subject: "❌ Build Failed: ${env.JOB_NAME} [#${env.BUILD_NUMBER}]",
                 body: "The Jenkins build has failed. Please check the console output for details:\n${env.BUILD_URL}"
        }
    }
}
