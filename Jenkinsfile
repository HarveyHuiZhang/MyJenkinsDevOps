pipeline {
  agent {
    docker {
      args '''pipeline {
    agent {
        docker {
            image \'maven:3-alpine\' 
            args \'-v /root/.m2:/root/.m2\' 
        }
    }
    stages {
        stage(\'Build\') { 
            steps {
                sh \'mvn -B -DskipTests clean package\' 
            }
        }
    }
}'''
        image 'Jenkinsfile.txt'
      }

    }
    stages {
      stage('build') {
        steps {
          readFile(file: 'Jenkinsfile', encoding: 'UTF-8')
        }
      }
    }
  }