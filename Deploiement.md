# Prérequis
- Docker 🐋🐳
- Docker compose 
-------------------------------------------------

# Etapes pour build et démarrer 
# Lancer Docker.desktop

# Constuire les images
Chaque service a un dockerfile, possibilité de tout builder avec :
```bash
docker compose build
```
🔺Avoir tous les ports exposés dans les dockerfile et dans le docker-compose.yml

# Lancer l'application 
```bash
docker compose up 
```
Grace à ça tout va démarrer (Mysql, Redis, les microservices, le client React)

# Accès à l'interface
Une fois que tout tourne, ouvrir: 
```bash
http://locahost:3000

```


# Tester la communication entre microservices 
```bash
http://localhost:8084/search-suggestion-list?query=Top
```
donne un JSON avec les suggestions

# Port

- Client React:	3000
- Authentication Service:	8081
- Common Data Service:	8082
- Payment Service:	8083
- Search Suggestion Service:	8084
- MySQL:	3306
- Redis:	6379