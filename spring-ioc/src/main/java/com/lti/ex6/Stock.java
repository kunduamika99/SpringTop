package com.lti.ex6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("stock")
//@Scope("singleton")
@Component
public class Stock {
    public Stock() {
        System.out.println("Default Constructor");
    }

    private static Stock stock;

    @Bean(name = "skt")
    @Scope("prototype")
    public static Stock get(){
        System.out.println("singelton method");
        if(stock==null) stock=new Stock();
        return stock;
    }
}