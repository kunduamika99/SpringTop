package StreamAPI;

import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> string1 = Stream.empty();

        Stream<String> string2 = Stream.of("John","Mark", "Ben", "Mathew");
//        System.out.println(string2.count());
        string2.forEach(n-> System.out.println(n));

        Stream<Double> dblStream = Stream.generate(Math :: random);
        dblStream.limit(10).forEach(a-> System.out.println(a));
//        System.out.println(dblStream.count());

        Stream streamInt = Stream.iterate(5, t->t<50, t->t+5);
        streamInt.forEach(b-> System.out.println(b));



    }
}
