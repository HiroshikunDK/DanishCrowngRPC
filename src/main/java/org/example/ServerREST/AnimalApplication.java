package org.example.ServerREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Import log4j classes.
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

@SpringBootApplication
public class AnimalApplication {
    static Logger logger = Logger.getLogger(AnimalApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AnimalApplication.class, args);
    }

}
