#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn install -DskipTests  

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/RecipesBrandNew-0.0.1-SNAPSHOT.jar demo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]
