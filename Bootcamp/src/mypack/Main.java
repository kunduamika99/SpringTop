package mypack;

public class Main {
    public static void main(String[] args) {
        int i1 = 100_000;
        long i2 = 100_000_00_00L;
        double i3 = 10_00.000_000_00;
        System.out.println("i1 = " + i1 + ", " + "i2 = " + i2+ ", " + "i3 = " + i3);
        int ch=1;
        int p;
        switch (3){
            case 1:
            case 2:
            case 3: p=4;break;
            case 4:
            case 5:
            case 6:p=9;
            default:p=3;break;
        }
        System.out.println(p);
    }
}
