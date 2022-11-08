#Initialise a new build stage and sets the Base Image for subsequent instructions.
#As such, a valid Dockerfile must start with a FROM instruction. The image can be any valid image.
#Here we are getting an image running Linux Alpine OS which has Java JDK 8 on it
FROM openjdk:8-jdk-alpine

#Add a bash shell to the base image defined above
RUN apk add --no-cache bash

#create a directory called 'app'
RUN mkdir /app

#The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
#Here we are setting the app directory we created above as the working directory
WORKDIR /app

#Copy all files and folders from our project root in to our 'app' working directory
COPY . /app

#Run the shadowJar gradle task using the bash shell we added previously, in order to package our JAR file
RUN ./gradlew shadowJar

#An ENTRYPOINT allows you to configure a container that will run as an executable.
#Here we are executing our JAR file via TestNG with a given xml test suite passed in from our $TEST_SUITE environment variable
ENTRYPOINT ["/bin/sh", "-c", "java -cp 'build/libs/seleniumgradle-test-1.0-SNAPSHOT-tests.jar' org.testng.TestNG $TEST_SUITE"]