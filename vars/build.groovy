def gitDownload(repo)
{
   git branch: 'main',
    url: "https://github.com/Himateja2122/${repo}.git"
}

def Build()
{
   sh 'mvn package'
}
