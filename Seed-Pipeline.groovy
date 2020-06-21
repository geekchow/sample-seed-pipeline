pipelineJob('sample-child-pipeline') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/geekchow/sample-scripted-pipeline.git')
            credentials('token-for-github')
          }
          branch('*/master')
        }
      }
      scriptPath('Jenkinsfile')
      lightweight()
    }
  }
}
