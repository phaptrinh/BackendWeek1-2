package com.example.week12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week12Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Week12Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started...");
    }
}
