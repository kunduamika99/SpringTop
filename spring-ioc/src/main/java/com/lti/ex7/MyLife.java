package com.lti.ex7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyLife {
    public MyLife() {
        System.out.println("Default method");
    }

    @PostConstruct
    public void init(){
        System.out.println("Liifecycle init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Lifecycle Destroy");
    }
}
