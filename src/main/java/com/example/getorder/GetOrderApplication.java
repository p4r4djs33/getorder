package com.example.getorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class GetOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetOrderApplication.class, args);
    }

}
