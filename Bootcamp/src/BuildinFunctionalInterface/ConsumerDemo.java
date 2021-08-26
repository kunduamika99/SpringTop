package BuildinFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println("Integer passed is = "+t);
    }

}

public class ConsumerDemo {
    public static void main(String[] args) {

       Consumer<Integer> intConsumer = new MyConsumer();
       intConsumer.accept(10);

        Consumer<Integer> integerConsumer =n->System.out.println("Lambda function = "+ n);
        integerConsumer.accept(100);

        List<Integer> list = Arrays.asList(10,20,40,50,70,30,80);
        list.stream().forEach(integerConsumer);
        list.stream().forEach(n -> {
            System.out.println("Lambda = " + n);
            System.out.print("");
        });

    }
}
