Client : front react 
server : microservices spring boot 

authentication-service (authentification utilisateurs avec Spring Security + JWT)

common-data-service (probablement pour des données partagées)

payment-service (gestion des paiements)

les services utilisent :

Spring Boot 2.3

Java 11

MySQL comme base de données

Spring Security pour l'auth

REST (Spring Web Starter)

la communication entre microservices semble être par API REST (HTTP).

communication : 
.env 
(client/src/api/).