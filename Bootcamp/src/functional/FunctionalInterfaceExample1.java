package functional;

@java.lang.FunctionalInterface
interface Calculator<T>{
    void addition(T num1, T num2);

    // void subtraction();

    default void defaultMethod(){

    }

    private void privateMethod(){

    }

    static void staticMethod(){

    }

}

interface Increment{
    int inc(int a);
}

interface Hello{
    String sayHello();
}

interface Calc<T>{
    T cube(T t1);
}

//class CalciImpl implements Calculator{
//    //overridden method
//    @Override
//    public void addition(int num1, int num2) {
//        int res = num1+num2;
//        System.out.println("Result = "+res);
//    }
//
//}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        //instantiating object
//        Calculator calci = new CalciImpl();
//        CalciImpl c = new CalciImpl();
        //calling overridden method
        Calculator<Double> calci = (num1, num2) -> {
                var res = num1+num2;
                System.out.println("Result = "+(res));
        };
        calci.addition(10.0,20.0);

        Increment in= (int a)->{return ++a;};
        int b = in.inc(10);
        System.out.println(b);

        Hello hello = ()->{
            return "Hello World";
        };
        System.out.println(hello.sayHello());

        Calc<Integer> c = a->a*a*a;
        System.out.println(c.cube(7));

//        Square s = n -> n*n;
        printSquare(n -> n*n);
    }

    static void printSquare(Square s){
        System.out.println(s.sq(4));
    }
}

@java.lang.FunctionalInterface
interface Square{
    int sq(int n);
    // object class method
    String toString();
    boolean equals(Object e);
}
