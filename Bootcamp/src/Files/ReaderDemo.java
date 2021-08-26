package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args){
        try(Reader reader = new FileReader("DIR/javaDemo.txt")) {
            char[] cbuf = new char[20];
            int read = reader.read(cbuf);
            StringBuilder sb = new StringBuilder();
            while (read>0){
                sb.append(cbuf, 0, read);
                read = reader.read(cbuf);
                System.out.print("\t"+read+"\t");
                System.out.print("\t"+reader+"\t");
                System.out.println();
            }
            System.out.println(sb);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
