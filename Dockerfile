FROM java:8-jdk-alpine
COPY ./build/libs/nasapicture-0.0.1-SNAPSHOT.war /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "nasapicture-0.0.1-SNAPSHOT.war"]