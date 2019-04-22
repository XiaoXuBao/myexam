package com.xxff;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxff.dao")
public class MyexamApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyexamApplication.class, args);
    }

}
