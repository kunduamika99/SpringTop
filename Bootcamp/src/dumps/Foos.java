package dumps;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Foo{
    public void foo(Collection arg){
        System.out.println("Bonjour");
    }
}

class Bar extends Foo{
    public void foo(Collection arg){
        System.out.println("Hello World");
    }

    public void foo(List arg){
        System.out.println("Hello World");
    }

}
public class Foos {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();
        Collection<String> c =  new ArrayList<>();
        f1.foo(c);
        f2.foo(c);
        b1.foo(c);
    }

}
