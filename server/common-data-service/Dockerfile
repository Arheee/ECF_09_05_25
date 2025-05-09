FROM openjdk:11-jdk-slim

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

# ✅ On renomme le jar pour simplifier l'exécution
RUN mv target/common-data-service.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]
