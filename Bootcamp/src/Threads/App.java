package Threads;

class Mythread implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable is running");
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId()+ "  "+ Thread.currentThread().getName());
        Thread t = new Thread();
        t.start();
        System.out.println(t.getId()+ "  "+ t.getName());

        Thread t2 = new Thread(new Mythread());
        t2.start();  //calls run function
        System.out.println(t2.getId()+" "+ t2.getName());
        System.out.println("Hello main");
    }
}
