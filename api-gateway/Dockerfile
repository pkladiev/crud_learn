FROM openjdk:17-jdk-slim

WORKDIR /app

COPY pom.xml .

COPY .mvn/ .mvn
COPY mvnw .
RUN ./mvnw dependency:go-offline -B

COPY src ./src

RUN ./mvnw clean package -DskipTests
RUN ls -l target/

EXPOSE 9090

CMD ["java", "-jar", "target/api-gateway-0.0.1-SNAPSHOT.jar"]