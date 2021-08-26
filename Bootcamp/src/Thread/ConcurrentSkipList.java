package Thread;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipList {
    static NavigableSet<String> myset = new ConcurrentSkipListSet<String>();

    public static void main(String[] args) {
        myset.add("Jane");
        myset.add("Austen");
        myset.add("Lizzy");
        myset.add("Lydia");
        myset.add("Sara");

        System.out.println(myset.headSet("Michael"));
        System.out.println(myset.higher("M"));

        ConcurrentNavigableMap<String,Integer> map = new ConcurrentSkipListMap<String, Integer>();
        map.put("Jane", 21);
        map.put("Austen", 34);
        map.put("Lizzy", 23);
        map.put("Lydia",95);
        map.put("Sara",24);
        System.out.println(map);
    }
}
