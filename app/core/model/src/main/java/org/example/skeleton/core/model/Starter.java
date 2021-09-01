package org.example.skeleton.core.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example.skeleton.core.model"})
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(org.example.skeleton.common.dal.config.Starter.class);
    }
}
