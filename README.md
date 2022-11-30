# qa-regression
Automated test cases used to verify that a code change in the software does not impact the existing functionality of the product.

# Pre-requisites
* Java
* Maven
* IntelliJ
* IntelliJ Plugins
  - Maven
  - Cucumber for Java
  - Gherkin
  - JUnit
  - TestNG
  - GitHub

# Setting up selenium-cucumber-java
  - Install Java and set path.
  - Install Maven and set path.
  - Clone repository or download zip.
  -  maven : https://github.com/FlexShopper/qa-regression

# Running features
  - Goto project directory.
  - Use "mvn test" command to run features.
  - Use "mvn clean install" to run features on a clean environment.
  - Use mvn test -Dcucumber.options="classpath:features/my_first.feature" to run specific feature if you have multiple feature files.

