package com.lti.ex10;

import org.springframework.stereotype.Component;

@Component("temp")
public class TempConverter {

    public void ctof(int c) {
        int f = (int) ((c*1.8)+32);
        System.out.println(c+" Cel to fah is "+f);
    }
    public void ftoc(int f) {
        int c = (f-32)*5/9;
        System.out.println(f+" Cel to fah is "+c);
    }
}