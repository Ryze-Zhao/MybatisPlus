package com.zhaolearn.mybatisplus2;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlus2ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    /**
     * 分页查询方式一
     *
     * @param
     * @return: void
     * @author: HeHaoZhao
     * @date: 2019/2/1 10:50
     */
    @Test
    public void selectList1() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();//新建QueryWrapper
        queryWrapper.orderByAsc("id");//以id排序，升序
        Page<User> page = new Page<>(1, 2);  // 查询第1页，每页返回2条
        IPage<User> iPage = userMapper.selectPage(page, queryWrapper);//查询
        System.out.println(JSONObject.toJSONString(iPage));//输出信息
        iPage.getRecords().stream().forEach(e -> System.out.println(e.toString()));//输出每个对象
    }

    /**
     * 分页查询方式一二
     *
     * @param
     * @return: void
     * @author: HeHaoZhao
     * @date: 2019/2/1 10:50
     */
    @Test
    public void selectList2() {
        Map<String, Object> m = new HashMap<>();
        m.put("age", 22);
        Page<User> page = new Page<>(1, 5);
        page.setRecords(userMapper.mySelectPage(m, page));
        System.out.println(JSONObject.toJSONString(page));
        page.getRecords().stream().forEach(e -> System.out.println(e.toString()));
    }
    @Test
    public void selectList3() {
        Map<String, Object> m = new HashMap<>();
        m.put("name", "%test3%");
        Page<User> page = new Page<>(1, 5);
        page.setRecords(userMapper.mySelectLikePage(m, page));
        System.out.println(JSONObject.toJSONString(page));
        page.getRecords().stream().forEach(e -> System.out.println(e.toString()));
    }


}