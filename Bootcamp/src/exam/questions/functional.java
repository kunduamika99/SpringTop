package exam.questions;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class functional {
    public static void main(String[] args) {

        System.out.println("*******");
        IntStream str = IntStream.of(2,3,4);
        IntFunction<IntUnaryOperator> func = x-> y-> x * y;
        str.map(func.apply(10)).forEach(System.out::println);
        System.out.println("*******");


    }
}
