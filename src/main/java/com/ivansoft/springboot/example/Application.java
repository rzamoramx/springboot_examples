package com.ivansoft.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = { "com.ivansoft.springboot.example" })
//@EnableJpaRepositories("com.ivansoft.springboot.example.repositories")
//@EntityScan(basePackages = "com.ivansoft.springboot.example.models")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // start the spring boot application
        SpringApplication.run(Application.class, args);
    }
}
