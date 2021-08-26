package Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 23);
        Employee emp2 = new Employee("Ben", 21);

        //writing objects in bin
        try(FileOutputStream out = new FileOutputStream("DIR/emps.bin");
            ObjectOutputStream oos = new ObjectOutputStream(out);){
            oos.writeObject(emp1);
            oos.writeObject(emp2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //reading objects
        try(FileInputStream fis = new FileInputStream("DIR/emps.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);){
            Employee e1 = (Employee) ois.readObject();
            Employee e2 = (Employee) ois.readObject();
            System.out.println(e1);
            System.out.println(e2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
