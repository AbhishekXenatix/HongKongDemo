pipeline{
  agent any
  
  stages{
    
    stage('Build Application'){
      steps{
        echo'Build App'
      }
    }
    
  stage('Test Application'){
      steps{
        echo'Test App'
      }
    }
    
    stage('Deploy Application'){
      steps{
        echo'Deploy App'
      }
    }
  }
  post
  {
    always
    {
      emailext body: 'Summary', subject: 'Pipeline Status', to: 'avyaanabhishek@gmail.com'
