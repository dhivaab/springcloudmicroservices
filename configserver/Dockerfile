FROM java:8-jre
WORKDIR usr/src
ADD ./target/configserver-0.0.1-SNAPSHOT.jar /usr/src/configserver-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","configserver-0.0.1-SNAPSHOT.jar"]