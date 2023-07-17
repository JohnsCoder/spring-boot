FROM ubuntu:latest AS build
RUN echo $DATABASE_URL

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/course-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
