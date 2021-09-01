package org.example.skeleton.bootstrap;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "org.example.skeleton.web.home")
public class Stater {
//--add-opens java.base/jdk.internal.loader=ALL-UNNAMED --add-opens java.base/jdk.internal.misc=ALL-UNNAMED
    public static void main(String[] args) throws IOException {
        SofaArkBootstrap.launch(args);
        SpringApplication.run(Stater.class);
    }

}