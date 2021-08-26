package dumps;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class Main {

    final void frontier() {
        List<Object> stars = List.of(1,2,3);
        stars.add(4);
        // m3
        List planets = new ArrayList<>();
        planets.add(5);
    }

    public static void main(String[] args) {
//        var bools = Stream.of(Boolean.TRUE, Boolean.FALSE);
//        var map = bools
//                .limit(2)    // line k
//                .collect(partitioningBy(b -> b));
//        System.out.println(map);


//        IntSummaryStatistics stats = Stream.of(20, 40)
//                .mapToInt(i -> i)
//                .summaryStatistics();
//        long total = stats.getSum();
//        long count = stats.getCount();
//        long max = stats.getMax();
//        System.out.println(total + "-" + count + "-" + max);

        var p = List.of(new StringBuilder("hello"),
                new StringBuilder("goodbye"),
                new StringBuilder("good"));
        var q = p.parallelStream().reduce(0,
                (w,x) -> w + x.length(),
                (y,z) -> y + z);
        System.out.print(q);


        var s = Stream.of("over the river",
                "through the woods",
                "to grandmother's house we go");
        s.filter(n -> n.startsWith("t"))
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .ifPresent(System.out::println);



    }




//        Main c = new Main();
//        var list = List.of("Cat","Hat");
//        String x = c.concat1(list);
//        String y = c.concat2(list);
//        System.out.print(x+" "+y);
//        keys.clear();
//        values= new String[0];
//        System.out.println("keys "+ keys.size()+" values: "+ values.length+ " map : "+map.size());

//        String[] towns = {"boston","paris","bankok","oman"};
//        Comparator<String> ms = Comparator.reverseOrder();
//        Arrays.sort(towns,ms);
//        Arrays.stream(towns).forEach(e-> System.out.println(e));
//        System.out.println(Arrays.binarySearch(towns,"boston"));

//        BiPredicate<String, String> pred = String::contains;
//        System.out.println(pred.test("fish", "is"));



//        var data = List.of(1,2,3);
//        int f = data.parallelStream()
//                .reduce(1, (a,b) -> a+b, (a,b) -> a+b);
//        System.out.println(f);





    }



