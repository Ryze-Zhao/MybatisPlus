package com.zhaolearn.druidmanydatasource.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门SysDepart
 *
 * @author HeHaoZhao
 * @version 1.0
 * @date 2019-08-28 18:36:26
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoContronller {
    @Autowired
    private PersonService personService;


    @GetMapping("/demo")
    public String getTree() {
        log.info("--------------------demo-start-----------------------");
        Person person = personService.getByNameInSlave("新增从数据库1");
        log.info("person-------------------------------------"+person.toString());
        Person person1 = personService.getById(1);
        log.info("person1-------------------------------------"+person1.toString());
        log.info("--------------------demo-end-----------------------");
        return "StringTest";
    }
}