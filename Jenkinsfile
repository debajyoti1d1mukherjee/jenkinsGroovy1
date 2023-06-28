def gv

pipeline {
    agent any

    environment {
        ENV1="ENV1VAL"
    }

    parameters{
        booleanParam(name:'executeTests', defaultValue: true, description: '')
        string(name:'strParam1', defaultValue:'strValue1', description: '')
        choice(name:'version', choices: ['1.1.0','1.2.0'], description: '')
    }

    stages {
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }

        stage("Build") {
            steps {
                script{
                    gv.buidApp()
                }
            }
        }

        stage("Test") {
            when{
                expression{
                    params.executeTests == True
                }
            }
            steps {
                script{
                    gv.testApp()
                }
            }
        }


        stage("Deploy") {
            steps {
                script{
                    gv.deployApp()
                }
                
            }
        }

    }
}