pipeline {
    agent { label 'built-in' }
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Check Java version") {
            steps {
                sh "java -version"
                sh "./gradlew -version"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}
