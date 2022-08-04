package com.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class BooksystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksystemApplication.class, args);
    }

}
