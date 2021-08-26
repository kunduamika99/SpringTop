package com.lti.ex2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStock {
    @Test
    public void testStock(){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex2ctx.xml");
        Stock s1 = appCtx.getBean(Stock.class);
        Stock s2 = appCtx.getBean(Stock.class);
    }
}
