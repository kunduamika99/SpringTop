package com.lti.ex8;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailMessage implements Message {

    public EmailMessage() {
        System.out.println("Email Constructor");
    }

    @Override
    public void send(String to, String message) {
        System.out.println(" Email sent to "+ to + " : Message: "+ message);
    }
}