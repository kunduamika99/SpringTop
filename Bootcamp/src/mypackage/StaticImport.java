package mypackage;
import mypack.c.StaticImportTest1;
import static mypack.c.StaticImportTest1.NAME;
import mypack.d.StaticImportTest2;
import static mypack.d.StaticImportTest2.*;
public class StaticImport {
    public static void main(String[] args) {
        System.out.println("Name is " + NAME);
        logger("This is Static import Test 1");
        new StaticImportTest1().display();
        System.out.println("Name is " + StaticImportTest2.NAME);
        StaticImportTest2.logger("This is Static IMport Test 2");
    }

}
