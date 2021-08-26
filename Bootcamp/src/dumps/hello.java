package dumps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class hello {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("tool", "hammer");
        map.put("problem", "nail");
        var props = new Properties();             // p1
        map.forEach((k,v) -> props.put(k, v));  // p2
        map.forEach((x,y)-> System.out.println(x + " " + y));
        String t = props.getProperty("tool");   // p3
        String n = props.getProperty("nail");
        System.out.print(t + " " + n);
        System.out.println();

//        var x = LocalDate.of(2022, 3, 1);
        var y = LocalDateTime.of(2022, 1, 1, 2, 55);
        var f = DateTimeFormatter.ofPattern("YY'-'mm");
        System.out.println(" " + f.format(y));
    }
}
