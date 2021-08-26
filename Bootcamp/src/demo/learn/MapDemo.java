package demo.learn;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        TreeMap<Integer,String> tree = new TreeMap<Integer, String>();
        String[] names = {"Alice", "Bob","Chloe","Drake", "Ester"};
        for (int i = 0; i <5 ; i++) {
            map.put(i+1,names[i]);
            tree.put(i+1,names[i]);
        }
        System.out.println(map);
        System.out.println(tree);
        map.entrySet().forEach(h->{
            System.out.println(h.hashCode()+" "+h.getKey()+" " + h.getValue()+" "+ h.getClass());
        });

        map.put(6,"Fiona");
        map.put(null, null);
        System.out.println(map.containsKey(8));
        System.out.println(map.containsValue("Chloe"));
        System.out.println(map.replace(null ,"Gina"));
        System.out.println(map.replace(7,"Hugh")); //no change
        System.out.println(map);
        map.replace(1,"Alice","Ann");
        System.out.println(map);
        map.putIfAbsent(10,"Mike");
        System.out.println(map);
        map.putIfAbsent(11,null);
        System.out.println(map);
        map.compute(11,(key,value)->((value==null)?"No Name":value));
        System.out.println(map);
        map.computeIfAbsent(null, (key)->((key==null)?"NoName":"Gina") );
        System.out.println(map);
        map.computeIfPresent(4, (key,value)->(value+" hello"));
        System.out.println(map);
    }
}
