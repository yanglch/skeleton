package org.example.skeleton.core.service;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Starter {
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
        SpringApplication.run(org.example.skeleton.common.dal.config.Starter.class);
    }
}
