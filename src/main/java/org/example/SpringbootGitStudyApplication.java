package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringbootGitStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGitStudyApplication.class, args);
    }

}
