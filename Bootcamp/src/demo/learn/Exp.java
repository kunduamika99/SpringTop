package demo.learn;

import java.util.Scanner;


public class Exp {
    public String hello = "hello";
    public static void main(String[] args) {
//        System.out.println(new Exp().hello.toString());
        Scanner s = new Scanner(System.in);
        try {
            System.out.print(1);
            s.nextLine();
            System.out.print(2);
            s = null;
        } catch (IllegalArgumentException |
                NullPointerException x) {
            s.nextLine();
            System.out.print(3);
        } finally {
            s.nextLine();
            System.out.print(4);
        }
        System.out.print(5);
    }
}
