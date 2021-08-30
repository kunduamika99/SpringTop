package com.lti.ex4;

import org.springframework.stereotype.Component;

public class EmailMessage implements Message {

    public EmailMessage() {
        System.out.println("Email Constructor");
    }

    @Override
    public void send(String to, String message) {
        System.out.println(" Email sent to "+ to + " : Message: "+ message);
    }
}
