
public class Employee {
    public Employee() {
        System.out.println("meow");
    }

    public void Employee(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        var builder = new StringBuilder("54321");
        builder.substring(2);
        System.out.println(builder.charAt(1));
        Employee e  = new Employee();
        e.Employee();
    }
}
