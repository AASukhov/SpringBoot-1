FROM openjdk:16.0.1
EXPOSE 8081
ADD /target/Spring-boot-HT-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]