package com.zhaolearn.druid.business;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.zhaolearn.druid.business.Person;
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}