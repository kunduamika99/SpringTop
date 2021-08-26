package Files;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class FileWriter {
    public static void main(String[] args) {
        try(Writer writer = new java.io.FileWriter("DIR/demoJava.txt")){
            writer.write("Hello There! ");
            writer.append("Anamika!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
