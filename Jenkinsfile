pipeline{
  agent any
  tools{
  maven 'Maven'
  }

  stages{
    
    stage('Build Application from GIT'){
      steps{
        git credentialsId: 'b7551c8b-22b8-4ef3-8e17-954c584a0773', url: 'https://github.com/AbhishekXenatix/HongKongDemo.git'
      }
    }
    
  stage('Test Application'){
      steps{
        sh "mvn clean test"
      }
    }
    

  }
}
