FROM openjdk:18.0.1-slim

# install curl for a health check
RUN apt-get update && apt-get install -y curl
# for spring boot
VOLUME /tmp
COPY ./target/*.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]