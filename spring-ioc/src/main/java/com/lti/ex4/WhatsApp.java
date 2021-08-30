package com.lti.ex4;

public class WhatsApp implements Message{
    public WhatsApp() {
        System.out.println("WhatsApp message Constructor ");
    }

    @Override
    public void send(String to, String message) {
        System.out.println(" WhatsApp sent to "+ to + " : Message: "+ message);
    }
}
