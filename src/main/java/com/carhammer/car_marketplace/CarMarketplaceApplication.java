package com.carhammer.car_marketplace;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarMarketplaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarMarketplaceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> System.out.println("Application started!");
    }
}
