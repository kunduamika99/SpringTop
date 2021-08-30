package com.lti.ex6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStock {
    @Test
    public void testStock(){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex6ctx.xml");
        Stock s1 = appCtx.getBean("skt",Stock.class);
        Stock s2 = appCtx.getBean("skt",Stock.class);
        System.out.println(s1==s2);
    }
}