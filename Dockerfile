FROM maven:3.9.0-amazoncorretto-17 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -Dmaven.test.skip=true

FROM gcr.io/distroless/java17-debian11
COPY --from=build /usr/src/app/target/demo-0.0.1-SNAPSHOT.jar /usr/app/demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/demo-0.0.1-SNAPSHOT.jar"]
