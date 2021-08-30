package com.lti.ex8;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
    @Test
    public void testMessage(){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex8ctx.xml");
        MessageProducer prod = appCtx.getBean("mp",MessageProducer.class);

        prod.process("sms","9870727270","Hello Buddy");
        prod.process("email","anamika@gmail.com","Namaskar");
        prod.process("wapp","~Anam11","Hey there am using Whatsapp");





    }
}
