package Threads;

import java.util.Scanner;

class RunThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"  "+ Thread.currentThread().getId());
            //new Scanner(System.in).nextInt();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
//                Thread.currentThread().interrupt();
//                break;
            }
        }
    }
}

public class RunThreaddemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new RunThread());
//        t.start();
//        t.interrupt();
        Thread t2 = new Thread(new RunThread());
        t.start();
        t.join(200);
        t2.start();


    }
}
