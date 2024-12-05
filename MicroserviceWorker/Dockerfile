FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceWorker-1.0.0.jar item.jar
EXPOSE 8084
ENTRYPOINT [ "java","-jar","item.jar" ]

