package com.why.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanghanyu
 * @create 2017-12-08 11:07
 */

//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.why.test"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
