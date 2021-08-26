package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BytesDemo {
    public static void main(String[] args) {
        byte[] bytes = {0xC, 0xE,0XA,0XB, 0XF, 0XA, 0XB, 0XE };
        try (OutputStream os = new FileOutputStream("DIR/byteBin.bin")){
            os.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(InputStream is = new FileInputStream("DIR/byteBin.bin")){
            byte[] all = is.readAllBytes();
            for (byte b: bytes){
                System.out.println(b+ "\t");
//                System.out.printf("0x%X\t", b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
