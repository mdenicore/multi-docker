FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
RUN echo "test"
RUN echo ${JAR_FILE}
COPY ./target/helloworld-api-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","/usr/app/helloworld-api-0.0.1-SNAPSHOT.jar"]