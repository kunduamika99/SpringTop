package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(ints.stream().reduce((a,b)->a+b).get());

        System.out.println(ints.stream().reduce(Integer::sum).get());

        System.out.println(ints.stream().reduce(ReduceExample::myReduce).get());

        Optional<Integer> ops = ints.stream().reduce((a,b)->a+b);
        System.out.println(ops.get());


    }

    private static int myReduce(int a, int b){

        return a+b;
    }
}
