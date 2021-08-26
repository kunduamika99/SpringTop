package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferDemo {
    public static void main(String[] args) {
        try(
                Writer writer = new FileWriter("DIR/javaDemo.txt");

        ){
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Writing data to buffered writer");
            bufferedWriter.flush();
//            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = Path.of("Directory/newJava.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write("Hello Anamika Kundu");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Data Saved");
        }


    }
}
