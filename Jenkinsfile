pipeline {
    agent any

    options {
        disableConcurrentBuilds()
        timestamps()
    }

    stages {
        stage('Build Bukkit bundle') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew --no-daemon :viaversion-bukkit:shadowJar'
            }
        }

        stage('Package stable artifact') {
            steps {
                sh '''
                    set -eu
                    mkdir -p dist
                    cp bukkit/build/libs/viaversion-bukkit-*.jar dist/ViaVersion.jar
                '''
                archiveArtifacts artifacts: 'dist/ViaVersion.jar', fingerprint: true, onlyIfSuccessful: true
            }
        }
    }
}
