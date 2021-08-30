package com.lti.ex10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:appctx.xml")
public class TestTemp {
    @Autowired
    private ApplicationContext appCtx;
    @Autowired
    private TempConverter tc;
    @Test
    public void testFtoC() {
//		ApplicationContext appCtx=new ClassPathXmlApplicationContext("appctx.xml");
//		TempConverter tc = (TempConverter) appCtx.getBean("temp");
        tc.ftoc(100);
    }
    @Test
    public void testCtoF() {
//		ApplicationContext appCtx=new ClassPathXmlApplicationContext("appctx.xml");
//		TempConverter tc = (TempConverter) appCtx.getBean("temp");
        tc.ctof(34);
    }
}
