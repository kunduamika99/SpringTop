package Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path1 = Paths.get("/demoJava.txt");
        Path path2 = Path.of("/DIR/javaDemo.txt");

        Path resolve = path1.resolve(path2);
        System.out.println(resolve);


        Path paths1 = Paths.get("/DIR/javaDemo.txt");
        Path paths2 = Path.of("demoJava.txt");

        Path resolves = paths1.resolveSibling(paths2);
        System.out.println(resolves);


        Path path11 = Paths.get("/DIR/javaDemo.txt");
        Path path22 = Path.of("/Directory");

        Path relative = path11.relativize(path22);
        System.out.println(relative);

    }
}
