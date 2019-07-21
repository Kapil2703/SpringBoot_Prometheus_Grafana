FROM openjdk:8
VOLUME /tmp
COPY /build/libs/my-spring-boot-0.1.0.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch my-spring-boot-0.1.0.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","my-spring-boot-0.1.0.jar"]