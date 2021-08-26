package BuildinFunctionalInterface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class Mysupplier implements Supplier<String[]>{

    @Override
    public String[] get() {
        return new String[] {"Alice","Bob","Ben", "David"};
    }
}
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String[]> supplier = new Mysupplier();
        System.out.println(Arrays.toString(supplier.get()));

        Supplier<String[]> sup = ()->{return new String[] {"Alice","Bob","Ben", "David","John"};};
        System.out.println(Arrays.toString(sup.get()));

        List<String> list = Arrays.asList("a","b","c","d","e");
        String s = list.stream().findAny().orElse("No Name");
        System.out.println(s);

        String ss = list.stream().filter(s1 -> s1!="a").findAny().orElseGet(()->"No Record");
        System.out.println(ss);
    }

}
