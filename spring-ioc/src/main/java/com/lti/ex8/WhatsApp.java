package com.lti.ex8;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("wapp")
@Lazy
public class WhatsApp implements Message{
    public WhatsApp() {
        System.out.println("WhatsApp message Constructor ");
    }

    @Override
    public void send(String to, String message) {
        System.out.println(" WhatsApp sent to "+ to + " : Message: "+ message);
    }
}