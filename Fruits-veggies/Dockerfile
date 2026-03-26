# Use Java 17 (working image)
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy files
COPY . .

# Give permission
RUN chmod +x mvnw

# Build project
RUN ./mvnw clean package -DskipTests

# Expose port
EXPOSE 8080

# Run app
CMD ["sh", "-c", "java -jar target/*.jar"]