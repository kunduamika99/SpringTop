package Local;

import java.nio.file.Path;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizationDemo {
    public static void main(String[] args) {
//        Locale locale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);

        Locale locale = new Locale("zh","CN");
//        ResourceBundle def = ResourceBundle.getBundle("Local/TextBundle", locale);
        ResourceBundle def = ResourceBundle.getBundle("Local/TextBundle", new Locale("zh"));



        Scanner sc = new Scanner(System.in);
        System.out.println(def.getString("nameMessage"));
        String name = sc.next();
        System.out.println(def.getString("passMessage"));
        String pass = sc.next();

        System.out.println(def.getString("hiMessage")+name+" "+def.getString("welcomeMessage"));
        System.out.println(name);

        System.out.println(def.getString("passwordMessage")+pass);
        System.out.println(pass);


    }
}
