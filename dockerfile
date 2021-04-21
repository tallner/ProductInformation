FROM openjdk:11-jdk-slim-buster
COPY target/bilar-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
