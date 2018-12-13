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

* To add the badge from Travis, paste the following code in the README file.

```
[![Build Status](https://travis-ci.org/{ORG-or-USERNAME}/{REPO-NAME}.png?branch=master)](https://travis-ci.org/{ORG-or-USERNAME}/{REPO-NAME})
```

* Replace the {ORG-or-USERNAME} with the username of the github.
* Replace the {REPO-NAME} with the name of the github repository used for Travis.
* In the field 'branch=master' choose the branch to be built.

Given below is the code that is being used for our repository.
[![Build Status](https://travis-ci.com/desinurch/AST_WS18.png?branch=dev)](https://travis-ci.com/desinurch/AST_WS18)

