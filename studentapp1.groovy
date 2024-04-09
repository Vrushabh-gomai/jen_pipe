pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                https://github.com/chetansomkuwar254/studentapp.ui.git
                echo 'done with this'
            }
        }
        stage('build') {
            steps {
                sh '/opt/apache-maven-3.9.3/bin/mvn clean package'
                echo 'build done'
            }
        }
        stage('quality-test') {
            steps {
                echo 'quality-test'
            }
        }
        stage('test') {
            steps {
                echo 'test done'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy done'
            }
        }
    }
}
