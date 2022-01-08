FROM eclipse-temurin:11
COPY target/myApplication-0.0.1-SNAPSHOT.jar myApplication-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "myApplication-0.0.1-SNAPSHOT.jar"]
