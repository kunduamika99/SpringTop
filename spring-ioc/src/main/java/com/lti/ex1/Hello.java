package com.lti.ex1;

public class Hello {
    private String message;

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

    public void setMessage(String message){
        System.out.println("Setter method");
        this.message = message;
    }

}
