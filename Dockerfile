#Start with a base image containing Java runtime
FROM openjdk:11-slim as build

#Information around who maintains the images
MAINTAINER restan

#Add the application's jar to the container
COPY target/practice-0.0.1-SNAPSHOT.jar practice-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java","-jar","/practice-0.0.1-SNAPSHOT.jar"]
