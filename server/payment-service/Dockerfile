FROM openjdk:11-jdk-slim

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

RUN mv target/payment-service.jar app.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "app.jar"]
