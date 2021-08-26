package Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class BufferReader {
    public static void main(String[] args) {
        Path path = Path.of("DIR/demoJava.txt");
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line = reader.readLine();
            while (line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(BufferedReader reader = Files.newBufferedReader(path)){
            Stream<String> lines = reader.lines();
            lines.forEach((x)->System.out.println(x));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
