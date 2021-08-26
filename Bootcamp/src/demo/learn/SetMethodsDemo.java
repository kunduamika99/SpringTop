package demo.learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMethodsDemo {
    public static void main(String[] args) {
        List<Integer> mydata = List.of(10,20,50,40,30,50);
        List<Integer> data = Arrays.asList(10,20,50,40,30,50);
        Set<Integer> hash = new HashSet<Integer>(mydata);
        TreeSet<Integer> tree = new TreeSet<Integer>(mydata);
        Set<Integer> linkedHash = new LinkedHashSet<Integer>(mydata);
        System.out.println(hash.equals(tree));
        System.out.println(tree.floor(35));
        System.out.println(tree.lower(20));
        System.out.println(tree.ceiling(36));
        System.out.println(tree.tailSet(30));
        System.out.println(tree);
    }
}
