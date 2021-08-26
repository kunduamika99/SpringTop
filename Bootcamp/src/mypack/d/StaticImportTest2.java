package mypack.d;

public class StaticImportTest2 {
    public static final String NAME="Static test 2";

    public static void logger(String log){
        System.out.println("Second Static log " +log);
    }
    public void display(){
        System.out.println("Hello second static test");
    }
}
