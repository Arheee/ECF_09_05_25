### ECF:  Reconstruction d'architecture et dockerisation d'une application microservices

1. Architecture 
L'application e-commerce est construite sur une architecture microservices. Chaque fonctionnalié principale est encapsulée dans un microservice distinct. Les services sont dévéloppés avec Sring boot et communiquent entre eux via api rest. 

# Microservices présents:

- authentication-service 
gestion des connexions.
- payment-service 
gestion des paiements.
- common-data-service 
expose des données globales (comme les mots-clés).
- search-suggestion-service
  nouveau, qui fournit des suggestions de recherche à partir de mots-clés.

# Frontend:
- client (react)
consomme les APIs des microservices

 2. Communication 
Les services parlent entre eux en HTTP via REST. Pour faciliter ça, j'ai utilisé Feign Client côté search-suggestion-service pour appeler common-data-service 
Grâce à Docker Compose, chaque service peut être appelé directement par son nom

