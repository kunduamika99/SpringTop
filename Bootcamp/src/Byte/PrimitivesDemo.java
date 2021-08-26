package Byte;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class PrimitivesDemo {
    public static void main(String[] args) {
        int[] ints = {1,2,5,3,4,6};
        byte[] bytes ={};

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dao = new DataOutputStream(baos);) {

            for(int i : ints){
                dao.writeInt(i);
            }
            bytes=baos.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(bytes.length);


        try(ByteArrayInputStream is = new ByteArrayInputStream(bytes);
            DataInputStream dis = new DataInputStream(is);) {
            while (dis.available() !=1){
                int read = dis.readInt();
                System.out.println(read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
