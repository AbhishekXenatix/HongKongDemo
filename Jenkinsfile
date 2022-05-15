pipeline{
  agent any
  
  stages{
    
    stage('Build Application from GIT'){
      steps{
        git credentialsID: 'AbhishekXenatix' , url: 'https://github.com/AbhishekXenatix/HongKongDemo.git'
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
