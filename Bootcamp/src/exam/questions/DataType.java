package exam.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataType {
    public static void main(String[] args) {
        var loc = Map.of("US",1, "UK",2);
//        var loc1 = List.of("US",null,"Uk");
        var loc2 = Set.of("Us","UK");
//        var loc3 = Set.of("Us","UK","UK");
        var loc4 = List.of("UK","US");

//        int i = 0;
//        for (;i<10;i++){
//            System.out.print(++i + " ");
//        }


        StringBuilder sb = new StringBuilder(5);
        sb.append("Howdy");
        sb.insert(0,' ');
        sb.replace(3,5,"LL");
        sb.insert(6,"COW");
        sb.delete(2,7);
        System.out.println(sb.length());
    }
}
