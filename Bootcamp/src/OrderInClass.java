class Sample{
    static {
        System.out.println("Other class static");
    }
}

public class OrderInClass {

    static int statementOrder;

    {
        System.out.println("Instance Initializer 1");
    }

    {
        System.out.println("Instance Initializer 2");
    }

    public OrderInClass() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Initializer 3");
    }

    public static void hello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Main Block");
        OrderInClass obj1 = new OrderInClass();
        Sample obj = new Sample();

    }
    static {
        System.out.println("Static Initializer");
    }

}

