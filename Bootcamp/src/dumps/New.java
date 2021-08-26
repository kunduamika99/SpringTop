package dumps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class New {
    public static void main(String[] args) {
        String s = "Hat at store";
        int x = s.indexOf("at");
        s.substring(x+3);
        x = s.indexOf("at");
        System.out.println(s+" "+ x);
        Number ix = 10.0;
        System.out.println(ix.intValue());

    }
}
