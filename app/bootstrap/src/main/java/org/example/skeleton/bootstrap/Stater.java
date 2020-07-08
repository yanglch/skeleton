package org.example.skeleton.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "org.example.skeleton.web.home")
public class Stater {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Stater.class);
    }

}