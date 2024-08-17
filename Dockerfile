FROM openjdk:17
COPY ./target/chapter4project-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","chapter4project-0.0.1-SNAPSHOT.jar"]
