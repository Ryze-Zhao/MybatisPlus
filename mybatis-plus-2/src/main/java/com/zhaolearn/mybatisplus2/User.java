package com.zhaolearn.mybatisplus2;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String testColumn;
}
