package mypack.c;

public class StaticImportTest1 {
    public static final String NAME="Static test 1";

    public static void logger(String log){
        System.out.println("First Static log " +log);
    }
    public void display(){
        System.out.println("Hello First static test");
    }
}
