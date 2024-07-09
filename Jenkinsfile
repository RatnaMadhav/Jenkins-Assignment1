pipeline {
  agent any
  tools {
    maven 'MAVEN'
  }

  stages {
    stage('Example') {
      steps {

        withMaven(maven: 'MAVEN') {

          bat 'mvn clean test'
        }
      }
    }
  }
}
