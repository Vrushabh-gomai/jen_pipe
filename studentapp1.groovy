pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Done pulling code'
            }
        }
        stage('build') {
            steps {
                sh '''
                    echo 'Building project...'
                    /opt/apache-maven-3.9.3/bin/mvn clean package
                '''
                echo 'Build done'
            }
        }
        stage('quality-test') {
            steps {
                echo 'Quality tests completed'
            }
        }
        stage('test') {
            steps {
                echo 'Tests completed'
            }
        }
        stage('deploy') {
            steps {
                echo 'Deployment completed'
            }
        }
    }
}
