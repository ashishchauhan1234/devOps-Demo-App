FROM amazoncorretto:21-alpine

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Spring Boot default)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]