package com.test;

import com.lti.Welcome;
//import com.lti.util.SendOff;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        w.welcome();

//        SendOff s = new SendOff();
//        s.send();
        try{
            Object obj = Class.forName("com.lti.util.SendOff").newInstance();
            Class c = obj.getClass();
            Method method = c.getMethod("send", null);
            method.invoke(obj,null);
        } catch (InstantiationException| ClassNotFoundException |NoSuchMethodException |IllegalAccessException |InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
