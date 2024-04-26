FROM openjdk:17
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} estate.jar
ENTRYPOINT ["java","-jar","/estate.jar"]
