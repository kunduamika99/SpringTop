package com.lti.ex2;

public class Stock {
    public Stock() {
        System.out.println("Default Constructor");
    }

    private static Stock stock;
     public static Stock get(){
         System.out.println("singelton method");
         if(stock==null) stock=new Stock();
         return stock;
     }
}
