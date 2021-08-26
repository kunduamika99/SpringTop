package Files;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterDemo {
    public static void main(String[] args) {
        try(StringWriter writer = new StringWriter()){
            writer.write("Hello Kundu! ");
            writer.append("Anamikas!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
