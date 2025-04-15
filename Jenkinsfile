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
                script {
                    try {
                        bat 'mvn clean install' // If this fails, the build will fail immediately
                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        throw e // This will fail the build immediately
                    }
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    def testRunStatus = 'SUCCESS' // Default status if tests run successfully
                    try {
                        // Run tests, but don't fail the build if tests fail
                        catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
                            bat 'mvn clean test'
                        }

                        // Check if tests were executed
                        def testReport = readFile('target/surefire-reports/*.xml')
                        if (!testReport) {
                            // If no test results are found, mark the build as FAILURE
                            currentBuild.result = 'FAILURE'
                            error "No tests were executed."
                        }

                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        throw e
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
