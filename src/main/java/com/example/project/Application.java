package com.example.project;

import Controllers.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Map;

@EnableJpaRepositories(basePackages = "com")
@SpringBootApplication()
@ComponentScan("Controllers")
@EntityScan("Model")
public class Application {

public static void main(String[] args) {
    System.out.println("Java version" + Runtime.version());
    Map<String, String> envMap = System.getenv();

    for (Map.Entry<String, String> entry : envMap.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    SpringApplication.run(Application.class, args);
}
}
