package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.first", "com.example.second"}, exclude = {DataSourceAutoConfiguration.class})
@EnableJpaRepositories
public class SpringSubFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSubFirstApplication.class, args);
    }

//    @Bean(name = "entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(DruidDataSourceBuilder.create().build());
//        return sessionFactory;
//    }
}
