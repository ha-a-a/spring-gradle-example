package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.*"}, exclude = {DataSourceAutoConfiguration.class})
@EnableJpaRepositories
@Configuration
public class SpringSubFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSubFirstApplication.class, args);
    }

}
