pipeline{
  agent any
  
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
    
    stage('Deploy Application'){
      steps{
        echo 'Deploy App'
      }
    }
  }
  post
  {
    always
    {
          email body: 'Summary', subject: 'Pipeline Status', to: 'avyaanabhishek@gmail.com'
    }
  }
}
