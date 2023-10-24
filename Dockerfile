FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY /home/runner/work/demo-cicd2/demo-cicd2/target/demo-cicd-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "demo-cicd-0.0.1-SNAPSHOT.jar"]
