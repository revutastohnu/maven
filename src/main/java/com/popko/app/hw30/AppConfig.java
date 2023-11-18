package com.popko.app.hw30;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService1() {
        return new MyService("Service 1");
    }

    @Bean
    public MyService myService2() {
        return new MyService("Service 2");
    }

    @Bean
    public MyRepository myRepository() {
        return new MyRepository();
    }
}

