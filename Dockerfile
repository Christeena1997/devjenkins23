FROM eclipse-temurin:17
COPY target/devjenkins-23.jar devjenkins-23.jar
CMD [ "java","-jar","devjenkins-23.jar" ]