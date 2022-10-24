FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} consumer.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/consumer.jar"]
