package BuildinFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class MyByConsumer implements BiConsumer<Integer,Integer>{

    @Override
    public void accept(Integer integer1, Integer integer2) {

    }

}

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (integer1,integer2)->{
            System.out.println("Sum = "+ (integer1+integer2));
        };
        biConsumer.accept(60,80);

        BiPredicate<Integer,Integer> biPredicate = (num1, num2) -> num2>num1?true:false;
        System.out.println(biPredicate.test(80,39));

        BiFunction<Integer,Integer,String> biFunction = (x,y) ->x>y?"The greater is "+x:"The greater is "+y;
        System.out.println(biFunction.apply(60,45));
    }
}
