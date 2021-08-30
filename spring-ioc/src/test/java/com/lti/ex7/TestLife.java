package com.lti.ex7;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {
    @Test
    public void TestLife(){
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("ex7ctx.xml");
        appCtx.getBean(MyLife.class);
        appCtx.close();
    }
}