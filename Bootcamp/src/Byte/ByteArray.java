package Byte;

import Files.BufferReader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ByteArray {
    public static void main(String[] args) {
        String str = "Hello Anamika";
        ByteArrayOutputStream buffer = null;

        try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(bos)){
            writer.write(str);
            buffer = bos;

        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] data = buffer.toByteArray();
        System.out.println(data);


        try(ByteArrayInputStream bis = new ByteArrayInputStream(data);
            InputStreamReader isr = new InputStreamReader(bis);
            BufferedReader br = new BufferedReader(isr);
        ){
            String s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
