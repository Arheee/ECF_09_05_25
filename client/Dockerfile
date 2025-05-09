FROM node:16 AS build

WORKDIR /app

COPY package*.json ./
RUN npm install

COPY . .
RUN npm run build

# serveur NGINX pour servir l'app
FROM nginx:alpine

COPY --from=build /app/build /usr/share/nginx/html

# Copie la config NGINX par défaut
COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 3000

CMD ["nginx", "-g", "daemon off;"]
