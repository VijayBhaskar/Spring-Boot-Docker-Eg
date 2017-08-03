package com.dockeg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaWebappApplication.class, args);
        /*
         * docker run -it --name spring-boot-jpa-docker-webapp -p 8080:8080 vijaydoc/spring-boot-docker-webapp:latest
         */
    }
}
