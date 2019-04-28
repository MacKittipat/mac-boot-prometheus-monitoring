FROM openjdk:8

WORKDIR /app

ADD target/mac-prometheus-monitoring-1.0-SNAPSHOT.jar /app/mac-prometheus-monitoring-1.0-SNAPSHOT.jar

CMD ["java", "-jar", "mac-prometheus-monitoring-1.0-SNAPSHOT.jar"]