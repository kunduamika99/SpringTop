package demo.learn;

import java.io.*;

public class PrintCompany {
    class Printer implements Closeable {     // r1
        public void print() {
            System.out.println("This just in!");
        }
        public void close() {
            System.out.println("Print close");
        }
    }
    public void printHeadlines() {
        try (Printer p = new Printer()) {
            p.print();
        } // r2
    }
    public static void main(String[] headlines) {
        new PrintCompany().printHeadlines();  // r3
    }
}