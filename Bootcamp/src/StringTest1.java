

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("Hello str 1");
        char[] str = {'a','b','c','d','e','f'};
        String str2 = new String(str);
        int offset=1;
        String str3 = new String(str, offset, str.length-offset);
        System.out.println(str3);
        System.out.println(str2);
        //String concatenation
        String s1 = "Hello";
        String st2  ="world";
        String s2=null;
        String str4  = s1+" "+s2;
        System.out.println(str4);
        int i=10;
        int j=20;
        st2 += i;
        System.out.println(st2);
        System.out.println(i+j+" = " +i+j);
        System.out.println(i+j+" = " +(i+j));
        String str5 = "helloworldhelloworldhelloworldhelloworld";
        String st3  ="world";
        int lastIndex = str5.lastIndexOf(st3, 20);
        System.out.println(lastIndex);
        int num=4;

    }
}
