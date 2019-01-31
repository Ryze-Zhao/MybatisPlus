package com.zhaolearn.mybatisplus1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhaolearn.mybatisplus1")
public class MybatisPlus1Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus1Application.class, args);
    }

}

