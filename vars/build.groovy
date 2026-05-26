def gitDownload(repo)
{
   git branch: 'main',
    url: "https://github.com/Himateja2122/${repo}.git"
}

def Build()
{
   sh 'mvn package'
}

def Deploye(jobname,ip,context)
{
     sh "scp /var/lib/jenkins/workspace/${jobname}/target/myapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
