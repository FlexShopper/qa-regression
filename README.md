# qa-regression
Automated test cases used to verify that code changes in the software does not impact the existing functionality of the product.
It allows you to run Cucumber features (tests/scenarios) in multiple browsers simultaneously using Selenium (WebDriver) and TestNG.

# We use the following in our framework:
* Selenium WebDriver: Selenium is a portable software-testing framework for web applications. We set up WebDrivers for automation in Google Chrome and Mozilla Firefox
* Cucumber: Cucumber is a software tool used by computer programmers for testing other software. It runs automated acceptance tests written in a behaviour-driven development style. Central to the Cucumber BDD approach is its plain language parser called Gherkin.
* TestNG: TestNG is a testing framework for the Java programming language. The design goal of TestNG is to cover a wider range of test categories: unit, functional, end-to-end, integration, etc., with more powerful and easy-to-use functionalities.

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
  - Install Java and set up Java environment variables.
  - Install Maven and set path.
  - Clone repository or download zip.
  -  maven : https://github.com/FlexShopper/qa-regression
  
# Setting Up Java
Java JDK: The Java Development Kit is an implementation of either one of the Java Platform, Standard Edition, Java Platform, Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle.
  - Download the Java JDK appropriate for your Operating System/Architecture from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  - Follow the wizard and complete the installation of the Java JDK
  
# Setting Up Java Environment Variables
An environment variable is a dynamic-named value that can affect the way running processes will behave on a computer.  Because every developer on a team will have a slightly different Development environment on there local machine, using environment variables is good practice to help easily find and use needed processes and/or paths in an environment.

* MacOS: Open up Terminal and type the following: 
        nano ~/.bash_profile
        export JAVA_HOME=$(/usr/libexec/java_home)
        export PATH=$JAVA_HOME/bin:$PATH
   - Add the following lines to your .bash_profile file within Terminal to set the $JAVA_HOME environment variable:
   - Save .profile and exit nano editor by pressing (in order, one at a time):
        Ctrl + O
        [Return]
        Ctrl + X
    - Completely quit out of Terminal and restart it to launch a fresh Terminal window with your changes applied
    - Confirm you have correctly set the $JAVA_HOME environment variable by typing in Terminal: 
        java -version

* Windows:
  - Click 'Start' and search for "System"
  - Go to 'Advanced System Settings' –> 'Advanced' –> 'Environment Variables'
  - Under the 'System Variables' section, click 'New' and then add and set the following new System Variable:
        Variable Name: JAVA_HOME
        Variable Value: C:\Program Files\jdk1.#.#_### (replace with directory path of where JDK was installed)
  - Double-click on 'Path' in the System Variables pane
  - Set and append the following PATH environment variable:
        C:\Program Files\jdk1.#.#_###\bin;
        ({jdk-root-directory-path}\bin)
  - Click 'OK' where applicable to apply your changes
  - Confirm you have correctly set the $JAVA_HOME environment variable by opening CMD Prompt and entering:
        java -version

# Setting Up Maven:
Maven is a build automation tool used primarily for Java projects, to manage its dependencies and any external libraries and packages the Java project may need.
Download Maven Binaries
  - Download the Maven binaries from https://maven.apache.org/download.cgi
  - If on Windows, download the zip file
  - If on MacOS, download the tar.gz file
  - Create a root directory for all your Framework related downloads (e.g. 'C:\FrameworkSetup' or '~/Users/username/FrameworkSetup')
  - Extract the downloaded Maven binaries and place the extracted Binaries directory inside the root directory you just created

# Setting Up Maven Environment Variables

* MacOS:
  - Open up Terminal and type the following:
        nano ~/.bash_profile
  - Add the following lines to your .bash_profile file within Terminal to set the $M2_HOME (Maven) environment variable:
        export M2_HOME=/Users/username/FrameworkSetup/apache-maven-#.#.#
        (replace directory with where you extracted Maven binaries to on your machine)
        export PATH=$JAVA_HOME/bin:$PATH
  - Save .profile and exit nano editor by pressing (in order, one at a time)…
        Ctrl + O
        [Return]
        Ctrl + X
  - Completely quit out of Terminal and restart it to launch a fresh Terminal window with your changes applied
  - Confirm you have successfully added and set the environment variable for Maven by entering:
        source ~/.bash_profile
        echo $M2_HOME

* Windows:
  - Click 'Start' and search for "System"
  - Go to 'Advanced System Settings' –> 'Advanced' –> 'Environment Variables'
  - Under the 'System Variables' section, click 'New' and then add and set the following new System Variables:
        Variable Name: M2_HOME
        Variable Value: C:\FrameworkSetup\apache-maven-#.#.#
        (replace directory with where you extracted Maven binaries to on your machine)
  - Double-click on 'Path' in the System Variables pane
  - Set and append the following PATH environment variable:
        %M2_HOME%\bin;
  - Click 'OK' where applicable to apply your changes
  - Confirm you have correctly set the Maven environment variables by opening CMD Prompt and entering:
        mvn --version

# Setting Up IntelliJ IDEA
IntelliJ IDEA is a Java IDE for developing computer software.  It is developed by JetBrains, and is available as a free community edition, or as a paid commercial edition.
  - Download the free, community edition of IntelliJ IDEA from https://www.jetbrains.com/idea/download
  - Complete installation of IntelliJ IDEA
  - Launch IntelliJ IDEA and choose to not import any settings (unless you have appropriate ones already)
  - Select your UI theme and click 'Next'
  - Select your keymap scheme and click 'Next'
  - Keep clicking 'Next' without changing anything on the following screens in the wizard
  - Click 'Start using IntelliJ IDEA'

# Install IntelliJ IDEA Plugins
Follow the instructions found here: https://www.jetbrains.com/help/idea/managing-plugins.html to install from Marketplace the plug ins.
  - Launch IntelliJ IDEA
  - Press Ctrl+Alt+S to open the IDE settings and select Plugins
  - Find the plugin in the Marketplace and click Install
  - Install the following plugins:
        Maven
        Cucumber for Java
        Gherkin
        JUnit
        TestNG
        GitHub
  - To install a specific version, go to the plugin page in the JetBrains Plugin Repository, download and install it as described in Install plugin from disk. For example, you can do it if the most recent version of the plugin is broken.

# Familiarize yourself with Intellij IDEA
Feel free to spend some time learning about IntelliJ IDEA here: https://www.jetbrains.com/help/idea/getting-started.html

# Packages & Directory Structure
The framework include the following packages and sub-packages:
  # src\main\java
  - src\main\java\pages
  - src\main\java\utils
  - src\main\java\utils\drivers
  - src\main\java\utils\helpers
  - src\main\java\utils\selenium
  # src\test\java
  - *src\test\java\features
  - *src\test\java\hooks
  - *src\test\java\stepdefinitions
  # src\test\resouces

# Files in each Package/Directory:

* Features package
Feature files is what Cucumber uses to write BDD scenarios using Gherkin language. The test scenarios are defined here. Currently, the test scenarios for FlexShopper PP3, FlexShopper UI and MyFlexlending UI can be found under the sub-packages: 
      features/pp3
      features/flexshopper
      features/myflexshopper

* Pages package
The 'pages' package will contain all the class files for our web pages/page objects. Currently, the pages for FlexShopper PP3, FlexShopper UI and MyFlexlending UI can be found under the sub-packages: 
      pages/pp3
      pages/flexshopper
      pages/myflexshopper
      
* Step Definitions package
The steps package will contain all our step definition classes, which will contain our step definitions/glue which links our steps in our test scenarios to the java methods which perform different actions. Currently, the step definitionss for FlexShopper PP3, FlexShopper UI and MyFlexlending UI can be found under the sub-packages: 
      stepdefinitions/pp3
      stepdefinitions/flexshopper
      stepdefinitions/myflexshopper
      
* Utils package
The 'utils' package contains sub-packages and utility classes.

* Drivers package
The 'drivers' package contains class files for all the different WebDrivers our test framework uses:
      ChromeWebDriver
      FirefoxWebDriver
      AppiumDriver

* Helpers package
The 'helpers' package will contain class files for all our static methods which can act as helpers to our existing functionality. Currently, the following classes can be found under this package:
      WebDriverHelpers
      WebElementHelpers
      SelectHelpers
      WaitHelpers
      ManageEmailTestAddresses
      RetrieveEmailVerificationCode

* Hooks package
The 'hooks' package contains classes for all the different hooks we can run before and/or after test runs/suites/scenarios etc.:
     CucumberHooks
     StepHooks
     TestRunHooks

* Selenium package
The 'selenium' package contains our core WebDriver setup and DriverController instance, as well as a Settings class where we can list public static variables to be used in our project:
     Driver
     DriverController
     Settings
     
# Clonning Project     

# Running features
  - Goto project directory.
  - Use "mvn test" command to run features.
  - Use "mvn clean install" to run features on a clean environment.
  - Use mvn test -Dcucumber.options="classpath:features/my_first.feature" to run specific feature if you have multiple feature files.

# Viewing the results
All Cucumber reports [html, json, xml, js] are in: target/cucumber-reports

