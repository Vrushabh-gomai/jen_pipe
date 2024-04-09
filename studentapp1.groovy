pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                // Assuming you want to clone the repository using git
                git 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Done pulling code'
            }
        }
        stage('build') {
            steps {
                sh '/opt/apache-maven-3.9.3/bin/mvn clean package'
                echo 'Build done'
            }
        }
        stage('quality-test') {
            steps {
                // Execute your quality tests here
                echo 'Quality tests completed'
            }
        }
        stage('test') {
            steps {
                // Execute your tests here
                echo 'Tests completed'
            }
        }
        stage('deploy') {
            steps {
                // Assuming you have a deployment step here, e.g., deploying to a server
                echo 'Deployment completed'
            }
        }
    }
}
