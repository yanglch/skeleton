package org.example.skeleton.common.dal.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example.skeleton.common.dal"})
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class);
    }
}
