FROM openjdk:8-jre-alpine
COPY mongodemo-0.0.1-SNAPSHOT.jar /mongodemo.war
expose 8080
CMD ["/usr/bin/java", "-jar", "/mongodemo.war"]