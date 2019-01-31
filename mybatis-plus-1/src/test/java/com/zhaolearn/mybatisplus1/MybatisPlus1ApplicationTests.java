package com.zhaolearn.mybatisplus1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlus1ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
//        userMapper.selectList(null).stream().forEach(e->System.out.println(e.toString()));
       System.out.println(userMapper.selectById(1).toString());
    }

}

