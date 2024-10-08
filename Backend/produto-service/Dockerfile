# Etapa 1: Imagem do Maven para compilar o projeto
FROM maven:3.9.3-eclipse-temurin-17 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo pom.xml e as dependências para a imagem
COPY pom.xml ./
COPY src ./src

# Executa o comando de instalação e build do Maven
RUN mvn clean install -DskipTests

# Etapa 2: Imagem do JDK para rodar a aplicação
FROM eclipse-temurin:17-jdk-alpine

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR do microserviço gerado na etapa anterior para esta imagem
COPY --from=build /app/target/produto-service-0.0.1-SNAPSHOT.jar ./produto-service.jar

# Exponha a porta que a aplicação irá usar
EXPOSE 8080

# Define o comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "produto-service.jar"]
