FROM openjdk:11-jdk-slim

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

RUN mv target/search-suggestion-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]
