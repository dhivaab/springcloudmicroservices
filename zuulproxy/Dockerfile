FROM java:8-jre
WORKDIR usr/src
ADD ./target/zuulproxy-0.0.1-SNAPSHOT.jar /usr/src/zuulproxy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","zuulproxy-0.0.1-SNAPSHOT.jar"]