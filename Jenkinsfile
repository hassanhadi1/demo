pipeline {
    agent any

    stages {
        stage('git clone') {
            steps {
                echo 'Vidage du dossier courant...'
                sh 'rm -rf *'
                echo 'Clonage du dépôt...'
                git branch: 'main', url: 'https://github.com/hassanhadi1/demo'
            }
        }
        stage('Maven Compile') {
            steps {
                sh 'mvn clean compile' 
            }
        }
        stage('Maven Test') {
            steps {
                sh 'mvn test' 
            }
        }
        stage('Maven Package') {
            steps {
                sh 'mvn package' 
            }
        }
        stage('Maven Run') {
            steps {
                echo 'Lancement de l\'application...'
                sh 'java -jar target/demo-0.1.jar'
            }
        }
        stage('Finish') {
            steps {
                echo "pipeline terminé"
            }
        }
    }
}
