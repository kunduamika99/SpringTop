class Sample1{
    public Sample1() {
        str2 = "String2" + str3;
    }
    static String str3;
    {
        str1 = "String1" + str3;
    }
    static {
        str3 = "String3";
        System.out.println(str3);
    }
    String str1, str2;
    static {

    }
}

public class MyClass {
    public static void main(String[] args) {
        Sample1 s = new Sample1();
        System.out.println(s);
    }
}
