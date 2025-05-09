FROM openjdk:11-jdk-slim

WORKDIR /app

# Copie tout le code du projet dans ce répertoire
COPY . .

# Compile l'application sans exécuter les tests
RUN ./mvnw clean package -DskipTests
# dans target je vérifie le nom du .jar avec ./mvnw clean package
RUN mv target/authentication-service.jar app.jar
# Expose le port sur lequel le microservice écoute
EXPOSE 8081

# Lance l'application
ENTRYPOINT ["java", "-jar", "app.jar"]