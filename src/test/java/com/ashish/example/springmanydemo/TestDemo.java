package com.ashish.example.springmanydemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {


    @Test
    public void test(){
        Assert.assertTrue(Boolean.TRUE);
        //context.getBean(MongoTemplate.class);
    }
}
