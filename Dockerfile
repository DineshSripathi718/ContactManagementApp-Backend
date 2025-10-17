# Use official Maven + Java to build
FROM maven:3.9.5-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml and download dependencies first (cache optimization)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the JAR (skip tests for deployment)
RUN mvn clean package -DskipTests

# Second stage: use slim Java runtime
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built JAR from the first stage
COPY --from=build /app/target/ContactManagementSystemApp-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Start the app
ENTRYPOINT ["java","-jar","app.jar"]
