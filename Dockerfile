FROM openjdk:8
ADD target/docker-spring-boot.jar docker-spring-boot.jar
ADD target/newrelic/newrelic.jar newrelic.jar
ADD target/newrelic/newrelic.yml newrelic.yml
EXPOSE 8080
##ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
ENTRYPOINT ["java", "-javaagent:./newrelic.jar","-jar", "docker-spring-boot.jar"]
