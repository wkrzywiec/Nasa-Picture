FROM gradle:6.7-jdk8 AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY . /workspace
RUN gradle build

FROM java:8-jdk-alpine
COPY --from=build /workspace/build/libs/nasapicture-0.0.1-SNAPSHOT.war /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "nasapicture-0.0.1-SNAPSHOT.war"]