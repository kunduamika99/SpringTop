package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class CheckEven implements Predicate<Integer>{

    @Override
    public boolean test(Integer i) {
        if(i%2==0) return true;
        return false;
    }

    @Override
    public Predicate and(Predicate other) {
        return null;
    }

    @Override
    public Predicate negate() {
        return null;
    }

    @Override
    public Predicate or(Predicate other) {
        return null;
    }
}
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (n)->{
            if(n%2==0)return true;
            return false;
        };
        System.out.println(predicate.test(92));

        Predicate<Integer> pred = new CheckEven();
        System.out.println(pred.test(97));

        List<Integer> list = Arrays.asList(10,23,81,84,29,21,33,66);
        list.stream().filter(pred).forEach(i-> System.out.println("Even number = "+i));
        list.stream().filter(t->t>40).filter(t->{if(t%2!=0)return true;return false;}).forEach(System.out :: println);
    }



}
