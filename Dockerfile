FROM openjdk:8-jdk-alpine
COPY ./build/libs/push-*.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]