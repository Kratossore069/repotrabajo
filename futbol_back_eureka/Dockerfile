FROM openjdk:18-jdk-alpine
VOLUME /main-app
EXPOSE 8080
ADD ./futbol_back_eureka.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]