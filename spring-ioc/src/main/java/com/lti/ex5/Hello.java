package com.lti.ex5;

import com.lti.ex8.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
public class Hello {
    private String message;

    @Autowired
    @Qualifier("sms")
    private Message msg;

    public Hello(String message) {
        System.out.println("Parameterized Constuctor");
        this.message = message;
    }

    public Hello() {
        System.out.println("Default Constuctor");
    }

    public String getMessage(){
        System.out.println("Getter method");
        return message;
    }

    @Value("Hola Spring")
    public void setMessage(String message){
        System.out.println("Setter method");
        this.message = message;
    }

}
