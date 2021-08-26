package demo.learn;

import java.util.List;
enum Season { SPRING, SUMMER, WINTER }
enum DayOfWeek{ SUNDAY ,MONDAY, TUESDAY, WEDNESDAY,  THURSDAY, FRIDAY, SATURDAY}
class hello{

    static String weight = "A lot";
    double ageMonths = 5, ageDays = 2;
    private static boolean success = true;
    public static void main(String... names) {

    }
}

class Day{
    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
//        final int Sunday = 0;
        int Sunday = 0;
        switch (otherDay) {
            default:
            case 1:
//                continue;
//            case thursday:
            case 4:
                return DayOfWeek.THURSDAY;
            case 2:
                break;
//            case Sunday:
            case 5:
                return DayOfWeek.SUNDAY;
//            case DayOfWeek.MONDAY:
            case 6:
                return
                        DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
}
public class Methods {
    static class hw{

    }
    static long r ;
    char a;
    {
        int fins = a;
    }

    public Methods() {

    }

    void print(int len){
        System.out.println();
    }

    public void len(float f) {
        System.out.println(a);
        {
            f++;
            System.out.println(f);
        }
    }
    static String weight = "A lot";
    double ageMonths = 5, ageDays = 2;
    private static boolean success = true;

    int prils;
    public static void main(String... names) {
        int start = (byte)(Byte.MAX_VALUE);
        System.out.println(start);
        hello h1 = new hello();
        h1.main("hwd", "iydb");

    }
}
