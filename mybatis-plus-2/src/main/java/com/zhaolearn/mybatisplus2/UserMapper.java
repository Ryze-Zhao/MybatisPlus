package com.zhaolearn.mybatisplus2;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM user WHERE age < #{mapABC.age} ORDER BY `id` ASC")
    List<User> mySelectPage(@Param("mapABC") Map<String,Object> mapABC, Page<User> page);


    @Select("SELECT * FROM user WHERE name like #{mapABC.name} ORDER BY `id` ASC")
    List<User> mySelectLikePage(@Param("mapABC") Map<String,Object> m, Page<User> page);
}
