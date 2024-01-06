FROM openjdk:11
MAINTAINER otus-exeriments
#EXPOSE 8000/tcp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]