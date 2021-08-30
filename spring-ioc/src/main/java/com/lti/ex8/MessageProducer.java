package com.lti.ex8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("mp")
public class MessageProducer implements ApplicationContextAware {

    @Autowired
    private ApplicationContext appCtx;

    public MessageProducer() {
        System.out.println("Message Producer Constructor ");
    }

    public void process(String type, String to, String msg){
        Message mess = (Message) appCtx.getBean(type);
        mess.send(to,msg);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appCtx = applicationContext;
    }
}
