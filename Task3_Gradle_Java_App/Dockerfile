FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY build/libs/codealpha-java-gradle-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
