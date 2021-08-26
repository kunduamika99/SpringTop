package Files;
import java.io.File;
import java.io.IOException;



public class FileDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("Directory");
        boolean dirCreated = dir.mkdir();
        System.out.println("DIR Created "+ dirCreated);

        File file = new File("DIR/javaDemo.txt");
        boolean fileCreated = file.createNewFile();
        System.out.println("File Created "+ fileCreated);

        File dirs = new File("DIR/directory/subdir");
        boolean dirsCreated = dirs.mkdirs();
        System.out.println("DIR deleted "+ dirsCreated);

        File Deldirs = new File("DIR/directory/");
        boolean DeldirsCreated = Deldirs.delete();
        System.out.println("DIRS Deleted "+ DeldirsCreated);

    }
}
