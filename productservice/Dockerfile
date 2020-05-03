FROM java:8-jre
WORKDIR usr/src
ADD ./target/productservice-0.0.1-SNAPSHOT.jar /usr/src/productservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","productservice-0.0.1-SNAPSHOT.jar"]