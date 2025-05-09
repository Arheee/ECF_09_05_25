package com.ut.ecommerce.searchsuggestionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SearchSuggestionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchSuggestionServiceApplication.class, args);
    }
}
