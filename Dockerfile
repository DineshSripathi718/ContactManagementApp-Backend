# Use official Java runtime
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file into container
COPY target/ContactManagementSystemAppBE-0.0.1-SNAPSHOT.jar app.jar

# Expose default Spring Boot port
EXPOSE 8080

# Start the Spring Boot app
ENTRYPOINT ["java","-jar","app.jar"]
