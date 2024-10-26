# Usando uma imagem oficial do OpenJDK com JDK 21 para o Kotlin e Spring Boot
# Use uma imagem base do Java
FROM openjdk:21-jdk-slim

# Adicione um diretório para a aplicação
WORKDIR /app

# Copie o arquivo JAR da aplicação para o container
COPY build/libs/*.jar app.jar

# Exponha a porta que a aplicação Spring Boot usará
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "petbrasil.jar"]

