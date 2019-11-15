package com.zhaolearn.druidmanydatasource.business;

import com.baomidou.mybatisplus.extension.service.IService;

public interface PersonService extends IService<Person> {

    boolean saveToSlave(Person person);

    Person getByNameInSlave(String s);
}
