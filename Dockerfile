# Initialise a new build stage and sets the Base Image for subsequent instructions.
# Here we are getting an image running Linux Alpine OS which has Java JDK 8 on it
FROM openjdk:8-jdk-alpine

# Add a bash shell to the base image defined above
RUN apk add --no-cache bash

# Create a directory called 'app'
RUN mkdir /app

# The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
# Here we are setting the app directory we created above as the working directory
WORKDIR /app

# Get the Maven wrapper and our pom.xml file into our image
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Execute the command mvnw dependency:resolve, which install all the dependencies into the image.
RUN ./mvnw dependency:resolve

#Copy all files and folders from our project root in to our 'app' working directory
COPY . /app

# An ENTRYPOINT allows you to configure a container that will run as an executable.
# Here we are executing our JAR file via TestNG with a given xml test suite passed in from our $TEST_SUITE environment variable
# ENTRYPOINT ["/bin/sh", "-c", "java -cp 'build/libs/FlexShopperFramework-1.0-SNAPSHOT-tests.jar' org.testng.TestNG $TEST_SUITE"]

# Docker will be running as a Maven wrapper
CMD ["./mvnw", "install"]