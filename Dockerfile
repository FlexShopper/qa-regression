#Initialise a new build stage and sets the Base Image for subsequent instructions.
#As such, a valid Dockerfile must start with a FROM instruction. The image can be any valid image.
#Here we are getting an image running Linux Alpine OS which has Java JDK 8 on it
FROM registry.flexshopper.xyz:5000/node:8

RUN apk add --no-cache openjdk7-jre

RUN rm -rf /var/cache/apk/*
RUN touch ~/.bashrc

#The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
#Here we are setting the app directory we created above as the working directory
WORKDIR /app

#Copy all files and folders from our project root in to our 'app' working directory
COPY . /app

#An ENTRYPOINT allows you to configure a container that will run as an executable.
#Here we are executing our JAR file via TestNG with a given xml test suite passed in from our $TEST_SUITE environment variable
ENTRYPOINT ["/bin/sh", "-c", "java -cp 'build/libs/FlexShopperFramework-1.0-SNAPSHOT-tests.jar' org.testng.TestNG $TEST_SUITE"]