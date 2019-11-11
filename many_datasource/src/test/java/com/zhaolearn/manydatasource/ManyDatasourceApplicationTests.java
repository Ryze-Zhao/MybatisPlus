package com.zhaolearn.manydatasource;



import com.zhaolearn.manydatasource.business.Person;
import com.zhaolearn.manydatasource.business.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ManyDatasourceApplicationTests {
    @Autowired
    private PersonService personService;

    @Test
    public void contextLoads() {
        Person person = new Person();
        person.setName("新增从数据库1");
        person.setAge(55);
        personService.saveToSlave(person);
    }

    @Test
    public void select() {
        Person person = personService.getByNameInSlave("新增从数据库1");
        log.info(person.toString());
    }
}