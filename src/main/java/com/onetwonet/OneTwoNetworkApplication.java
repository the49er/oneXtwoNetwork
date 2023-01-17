package com.onetwonet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= "com")
public class OneTwoNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneTwoNetworkApplication.class, args);
    }
}
