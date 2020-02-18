     
FROM openjdk:12-alpine

COPY Hello1.jar Hello1.jar
Run java -jar Hello1.jar
EXPOSE 8080
CMD ["java", "-jar", "Hello1.jar"]
