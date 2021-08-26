package Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/src/../../src/DIR/../DIR");
//        Path path2 = Path.of("/DIR/javaDemo.txt");
        Path normal = path1.normalize();
        System.out.println(normal);
    }
}
