package demo.learn;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        for (int i = 1; i <=10 ; i++) {
            myList.add("Value"+i);
        }
        System.out.println(myList.toString());
//        List<String> copied = List.copyOf(myList);
        List<String> copied = List.copyOf(myList.subList(0,5));
        System.out.println(copied.toString());
    }
}
