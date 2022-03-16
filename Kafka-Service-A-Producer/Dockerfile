FROM gradle:7.3.1-jdk8 AS build
#ENV kafka=kafka
#ENV port=9092
COPY --chown=gradle:gradle . /home/gradle/src
RUN mkdir /files
COPY  --chown=./src/main/resources/employee_records/employees.csv . /files/employees.csv
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:8-jre-slim
EXPOSE 9090
RUN mkdir /app

RUN mkdir /file

COPY --from=build /home/gradle/§src/build/libs/*.jar /app/service-a.jar
COPY --chown=/files/employees.csv . /file/employees.csv
#MAINTAINER junaidshakeel
#COPY  --from=build build/lib/Kafka-Service-A-Producer-0.0.1-SNAPSHOT.jar Kafka-Service-A-Producer.jar
ENTRYPOINT ["java","-jar","/app/service-a.jar"]