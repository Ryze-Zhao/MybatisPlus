package com.zhaolearn.druid.business;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaolearn.druid.business.Person;
import com.zhaolearn.druid.business.PersonMapper;
import com.zhaolearn.druid.business.PersonService;
import org.springframework.stereotype.Service;
@Service
//可以不指定，会使用默认的主数据库
@DS("master")
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {
    @Override
//    使用DS指定该方法操作的数据库
    @DS("slave")
    public boolean saveToSlave(Person person) {
        return baseMapper.insert(person) != 0;
    }

    @Override
    //    使用DS指定该方法操作的数据库
    @DS("slave")
    public Person getByNameInSlave(String name) {
        //粗略写，毕竟比较名字，可能会有重复
        return baseMapper.selectOne(new LambdaQueryWrapper<Person>().eq(Person::getName,name));
    }
}
