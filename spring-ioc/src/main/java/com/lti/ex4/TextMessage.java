package com.lti.ex4;

public class TextMessage implements Message{
    public TextMessage() {
        System.out.println("Text message Constructor ");
    }

    @Override
    public void send(String to, String message) {
        System.out.println(" Text Message sent to "+ to + " : Message: "+ message);

    }
}
