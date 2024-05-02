FROM amazoncorretto:17.0.11-al2023-headless
WORKDIR /app
COPY app.jar app.jar
EXPOSE 9092
CMD ["java","-jar","app.jar"]
      
