FROM openjdk:11-jdk-slim

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

RUN mv target/search-suggestion-service.jar app.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]
