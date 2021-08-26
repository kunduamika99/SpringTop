package demo.learn;

abstract interface CanSwim {
    public void swim(final int distance);
}

public class Abs {
    final int distance = 2;
    public static void main(String[] seaweed) {
        final int distance = 3;
        CanSwim seaTurtle = new CanSwim(){
        final int distance = 5;

        public void swim(final int distance) {
            System.out.print(distance);
        }
        };
        seaTurtle.swim(7);

    }
}
