package BuildinFunctionalInterface;

import java.util.function.Function;

class MyFunction implements Function<Integer,String>{

    @Override
    public String apply(Integer integer) {
        if(integer>=18) return "You are eligible to cast vote";
        return "you are not eligible to cast vote";
    }

    @Override
    public <V> Function<V, String> compose(Function<? super V, ? extends Integer> before) {
        return null;
    }

    @Override
    public <V> Function<Integer, V> andThen(Function<? super String, ? extends V> after) {
        return null;
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,String> function = new MyFunction();
        System.out.println(function.apply(10));

        Function<Integer,String> function1 = (integer)->{
            if(integer>=18) return "You are eligible to cast vote";
            return "you are not eligible to cast vote";
        };
        System.out.println(function1.apply(22));
    }
}
