package demo.learn;


import java.util.ArrayList;

public class Main
{

    public static void main(String[] args) {
        Integer num1 = 1;
        Integer num2 = 50;
        System.out.println(num1.compareTo(num2));
        Integer char1 = (int) 'A';
        Integer char2 = (int) 'B';
        System.out.println(char1.compareTo(char2));
        System.out.println(Integer.compare(num1, num2));
        System.out.println(Character.compare('a','A'));
        System.setProperty("num", "3000");
        System.setProperty("isEnabled", "true");
        Integer val1 = Integer.getInteger("num");
        System.out.println(val1);
        Boolean val2 = Boolean.getBoolean("isEnabled");
        System.out.println(val2);
        var list = new ArrayList<Integer>();
        list.add(10);list.add(9);list.add(8);
        var num = 9;
        list.removeIf(x->{int keep = num;return keep!=x;});
        System.out.println(list);
        list.removeIf(x->{int keep = num;return keep==x;});
        System.out.println(list);
        var builder = "54321";
        builder = builder.substring(4);
        System.out.println(builder);
        var sb = new StringBuilder("radical");
        sb.insert(sb.length(),"robots");
        System.out.println(sb);
        var teams = new String("694");
        teams.concat("1184");
        System.out.println(teams);
        do{

        }while (num==9);
    }
}
