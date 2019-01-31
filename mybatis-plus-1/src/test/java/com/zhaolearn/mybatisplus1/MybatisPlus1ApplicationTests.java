package com.zhaolearn.mybatisplus1;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlus1ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testByNull() {

        userMapper.selectList(null).stream().forEach(e -> System.out.println(e.toString()));
        //System.out.println(userMapper.selectById(1).toString());
    }

    @Test
    public void testByMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        //精确查询的
        map.put("test_column", "test1");
        userMapper.selectByMap(map).stream().forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void testByWrapper(){
        User user=userMapper.selectById(1);
        userMapper.selectList(new QueryWrapper<User>().like("test_column","test")).stream().forEach(e -> System.out.println(e.toString()));
    }


}

