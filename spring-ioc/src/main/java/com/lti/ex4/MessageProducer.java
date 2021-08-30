package com.lti.ex4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageProducer implements ApplicationContextAware {

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
