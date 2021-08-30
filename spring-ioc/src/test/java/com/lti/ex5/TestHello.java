package com.lti.ex5;

import com.lti.ex8.Message;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    @Test
    public void testMessage()
    {
        ApplicationContext appCtx=new ClassPathXmlApplicationContext("appCtx.xml");
        Hello h = (Hello) appCtx.getBean("hi");
        System.out.println(h.getMessage());


        ApplicationContext appctx = new AnnotationConfigApplicationContext(Hello.class);
        Hello ws = (Hello) appCtx.getBean("weather");
        System.out.println(ws.getMessage());

        //        Hello h1 = (Hello) appCtx.getBean("hi");
        //        h1.setMessage("Anamika");
        //        System.out.println(h1.getMessage());

//        System.out.println("**********");
//        ApplicationContext appCtx2=new ClassPathXmlApplicationContext("ex5ctx2.xml");
//        Hello h2 = (Hello) appCtx2.getBean("hi");
//        System.out.println(h2.getMessage());

    }

}