package com.fresco;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // create an empty list
        List<String> emptylst = Collections.emptyList();

        System.out.println("Created empty immutable list: "+emptylst);

        // try to add elements
        emptylst.add("A");
        emptylst.add("B");
        System.out.println(emptylst);
    }

}
