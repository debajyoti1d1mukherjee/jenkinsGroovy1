
def buildApp(){
	echo 'Build App'
}

def testApp(){
	echo 'Test App'
}

def deployApp(){
	echo 'Deploy App'
	echo "Branch is ${GIT_BRANCH}========"
	echo "Deploying version ${version}========"
	echo "strParam1 paramValue is  ${strParam1}========"
	echo "env  paramValue is  ${ENV1}========"
}