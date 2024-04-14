FROM openjdk:11-jre-slim
ARG JAR_FILE=target/*.jar
COPY ./target/MovieProject-1.0-SNAPSHOT.jar app.jar
ENV DATASOURCE_URL=jdbc:postgresql://database-movies.c342ug4mmfb2.eu-north-1.rds.amazonaws.com:5432/initial_database_movies
ENV DATASOURCE_USERNAME=postgres
ENV DATASOURCE_PASSWORD=postgres
ENTRYPOINT ["java","-jar","/app.jar"]