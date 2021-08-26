package com.test;

import com.service.ServiceRegistry;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        Iterable<ServiceRegistry> services =  ServiceLoader.load(ServiceRegistry.class);
        services.forEach((service)->service.sayHello());

    }
}
