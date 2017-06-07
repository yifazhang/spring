package com.zhangyifa.bean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by zhangyifa on 6/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application-content.xml"})
public class SrewDriverTest {

    @Autowired
    private BeanFactory factory;


    @Test
    public void use() throws Exception {
        SrewDriver srewDriver =  factory.getBean("screwDriver",SrewDriver.class);
        srewDriver.setColor("green");
        srewDriver.use();

        SrewDriver srewDriver2 =  factory.getBean("screwDriver",SrewDriver.class);
        srewDriver2.use();
    }


}