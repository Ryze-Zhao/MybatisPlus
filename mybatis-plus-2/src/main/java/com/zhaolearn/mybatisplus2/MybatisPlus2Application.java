package com.zhaolearn.mybatisplus2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhaolearn.mybatisplus2")
public class MybatisPlus2Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus2Application.class, args);
    }

}

