pipeline {
    agent any

    tools {
        maven 'Maven_Home'
        jdk 'my JDK'
        allure 'allure'
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
                    // Set build result to UNSTABLE in case of failures
                    catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
                        bat 'mvn clean test'
                    }
                }
            }
        }
    }

    post {
        always {
            // Archive build artifacts
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true

            // Generate Allure Report even if tests fail
            allure([
                includeProperties: false,
                jdk: '',
                results: [[path: 'target/allure-results']]
            ])
        }
    }
}
