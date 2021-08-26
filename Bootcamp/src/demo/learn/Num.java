package demo.learn;

import java.io.Closeable;
import java.io.IOException;
import java.util.*;




public class Num {
    public Num() {
    }

    public static void main(String[] args) {
        var numbers = new HashSet<Number>();
        Integer in = new Integer(86);
        numbers.add(in);
        numbers.add(75);
        numbers.add(in);
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());
        var a = 1234;
        var b = ""+a;
    }
}


enum Proposition {
    TRUE(1) { protected String getNickName() { return "RIGHT"; }},
    FALSE(2) { public String getNickName() { return
            "WRONG"; }},
    UNKNOWN(3) { public String getNickName() { return
            "LOST"; }};
    public int value;
    Proposition(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    protected abstract String getNickName();
    }

class Cinema {
    protected String name = "Sequel";
    public Cinema() {
        this.name = name;
    }
}
class Movie extends Cinema {
    private String name = "adaptation";

    public static void main(String[] showing) {
        System.out.print(new Cinema().name);
    } }