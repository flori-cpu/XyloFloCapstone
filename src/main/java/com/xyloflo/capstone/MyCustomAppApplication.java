package com.xyloflo.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Mark this as the main application class
@SpringBootApplication
public class MyCustomAppApplication {

    private static final Logger logger = LoggerFactory.getLogger(MyCustomAppApplication.class);

    // The entry point of your Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(MyCustomAppApplication.class, args);
        logger.info("My Custom App is running...");
    }
}



