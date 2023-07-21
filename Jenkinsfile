pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Vidage du dossier courant...'
                sh 'rm -rf *'
                echo 'Clonage du dépôt...'
                git 'https://github.com/hassanhadi1/demo'
            }
        }
        stage('Build') {
            steps {
                echo 'Déplacement dans le dossier git...'
                dir('your-repo-dir') {
                    echo 'Construction du projet...'
                    sh 'cd demo' 
                }
            }
        }
        stage('Run') {
            steps {
                echo 'Lancement de l\'application...'
                sh 'mvn clean && mvn install && mvn compile && mvn test && mvn package && mvn verify'
                sh 'java -jar target/demo-0.1.jar'
            }
        }
    }
}
