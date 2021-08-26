package mypackage;

public class Overloading {
    void thisOne(Integer i){
        System.out.println("Integer");
    }

    public static int getFloor() {
        return floor;
    }

    private static int floor;
    public void thisOne(int i){
        System.out.println("integer");
    }
    public void thisOne(long i){
        System.out.println("Long");
    }
    public void thisOne(short i){
        System.out.println("Short");
    }
    public void thisOne(char... i){
        System.out.println("Char");
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.thisOne((int) 'a');
    }
}
