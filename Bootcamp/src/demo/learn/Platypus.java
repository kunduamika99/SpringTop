package demo.learn;

class Mammal{
    private void sneeze(){

    }
    public Mammal(int age){
        System.out.println("Mammal");
    }

    public Mammal() {
    }

}
public class Platypus extends Mammal{
    int sneeze(){
        return 10;
    }

    public Platypus() {
        super(5);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
//        new Platypus(5);
        new Mammal(3);
    }
}
