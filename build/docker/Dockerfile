FROM openjdk:8
WORKDIR .
COPY /build/libs/my-spring-boot-0.1.0.jar /usr/app/
VOLUME /tmp
WORKDIR /usr/app
RUN sh -c 'touch my-spring-boot-0.1.0.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","my-spring-boot-0.1.0.jar"]