public class NarrowingTest {
    public static void main(String[] args) {
        System.out.println("Byte Min = "+ Byte.MIN_VALUE + " Max Value "+ Byte.MAX_VALUE);
        System.out.println("Char Min = "+ (int)Character.MIN_VALUE + " Max Value "+ (int)Character.MAX_VALUE);
        System.out.println("Short Min = "+ Short.MIN_VALUE + " Max Value "+ Short.MAX_VALUE);
        System.out.println("Int Min = "+ Integer.MIN_VALUE + " Max Value "+ Integer.MAX_VALUE);
        System.out.println("Float Min = "+ Float.MIN_VALUE + " Max Value "+ Float.MAX_VALUE);
        System.out.println("Long Min = "+ Long.MIN_VALUE + " Max Value "+ Long.MAX_VALUE);
        System.out.println("Double Min = "+ Double.MIN_VALUE + " Max Value "+ Double.MAX_VALUE);

        float f1 = 0.0f;
        char ch1='a';
        char ch2 = 97;
        System.out.println(ch2);
        double d4 = Double.MAX_VALUE+1;
        System.out.println(d4);
    }
}
