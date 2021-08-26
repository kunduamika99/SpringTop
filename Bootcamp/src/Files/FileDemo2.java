package Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo2 {
    public static void main(String[] args) {
        Path path1 = Paths.get("DIR/javaDemo.txt");
        Path path2 = Path.of("/DIR/javaDemo.txt");

        System.out.println("Path1  =  "+ path1.getClass());
        System.out.println("Path2  =  "+ path2.getClass());
        boolean abs = path1.isAbsolute();
        System.out.println("Abs path : "+ abs);
        Path path = path1.getRoot();
        System.out.println("Root : " + path);
    }
}
