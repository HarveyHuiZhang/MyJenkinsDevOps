pipeline {
  agent any
  stages {
    stage('sources') {
      steps {
        git(url: 'https://github.com/HarveyHuiZhang/MyJenkinsDevOps.git', branch: 'development')
        echo 'Git sources is ready now.'
      }
    }
    stage('build') {
      steps {
        powershell(script: 'C:/Users/hzhang193/projects/demo/powershell/build.ps1', encoding: 'utf-8', returnStatus: true, returnStdout: true)
        echo 'Maven building is completed.'
      }
    }
    stage('sonar') {
      steps {
        powershell(script: 'C:/Users/hzhang193/projects/demo/powershell/sonar.ps1', encoding: 'utf-8', returnStatus: true, returnStdout: true)
      }
    }
  }
}