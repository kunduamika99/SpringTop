package functional;

interface Doable{
    void doIt();
}

interface ExtebdDoable extends Doable{
    default void doIt(){
        System.out.println("Default overriden method");
    }
    void extendedDoit();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        ExtebdDoable ex = ()->{
            System.out.println("Overriding method");
        };
        ex.doIt();
        ex.extendedDoit();
    }
}
