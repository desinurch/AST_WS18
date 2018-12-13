# Advanced Software Technology - Project 2018

## Steps for Code Integration using Travis

* Go to link https://github.com/marketplace/travis-ci
* Click on 'Set up a plan'
* This takes you to the bottom of the webpage where you have to choose a payment plan. Choose the free plan.
* Login to your github account.
* Select the repository that you want to link to Travis.
* Create a .travis.yml file.
* Add the following content in the file if using the language Java and Ant Build.

```
language: java
jdk:
  - oraclejdk8

script: ant build
```
* Commit and push this file to your github repo.
* This will cause a Travis CI build.
* Everytime a new code is pushed to the repo with an antbuild file 'build.xml', the Travis CI build is triggered and it checks the code build.

For more info, refer to the link : https://docs.travis-ci.com/user/tutorial/

## Steps for adding the badges to README.md


