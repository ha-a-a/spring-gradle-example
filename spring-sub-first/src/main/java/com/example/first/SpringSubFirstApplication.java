package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.first","com.example.second"})
public class SpringSubFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSubFirstApplication.class, args);
    }

}
