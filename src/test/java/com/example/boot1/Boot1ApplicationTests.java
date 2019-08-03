package com.example.boot1;

import com.example.boot1.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import sun.awt.AppContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot1ApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void  testHelloService(){
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
