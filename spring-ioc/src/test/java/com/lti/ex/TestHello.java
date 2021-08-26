package com.lti.ex;
import com.lti.ex1.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    @Test
    public void testMessage()
    {
        ApplicationContext appCtx=new ClassPathXmlApplicationContext("ex1ctx.xml");
        Hello h = (Hello) appCtx.getBean("hi");
        System.out.println(h.getMessage());

        //        Hello h1 = (Hello) appCtx.getBean("hi");
        //        h1.setMessage("Anamika");
        //        System.out.println(h1.getMessage());

        System.out.println("**********");
        ApplicationContext appCtx2=new ClassPathXmlApplicationContext("ex1ctx2.xml");
        Hello h2 = (Hello) appCtx2.getBean("hi");
        System.out.println(h2.getMessage());

    }

}