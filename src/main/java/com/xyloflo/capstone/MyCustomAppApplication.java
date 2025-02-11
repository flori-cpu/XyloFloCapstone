package com.xyloflo.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Mark this as the main application class
@SpringBootApplication
public class MyCustomAppApplication {

    // The entry point of your Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(MyCustomAppApplication.class, args);
        System.out.println("My Custom App is running...");
    }
}