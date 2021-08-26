package dumps;

class ConSuper{
    protected ConSuper() {
        this(2);
        System.out.print("3");
    }
    protected ConSuper(int a) {
        System.out.print(a);
    }

}
public class ConSub extends ConSuper{
    ConSub(){
        this(4);
        System.out.print("1");
    }
    ConSub(int a){
        System.out.print(a);
    }

    public static void main(String[] args) {
        new ConSub(4);
    }


}
