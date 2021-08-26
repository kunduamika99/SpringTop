package Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
    static ExecutorService es = null;
    public static Future<Double> getRandom(int i ){
        es = Executors.newSingleThreadExecutor();
        return es.submit(()->{
            System.out.println(i);
            Thread.sleep(1000);
            return Math.random();
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Double> doubleFuture = getRandom(1);
//        getRandom(2);
//        getRandom(3);
//        getRandom(4);
        doubleFuture.cancel(true);
        if(doubleFuture.isCancelled()){
            System.out.println("cancelled");
        }
        if (doubleFuture.isDone()){
            System.out.println("DOne");
        }
        while (!doubleFuture.isDone()){
            if(doubleFuture.isCancelled()){
                System.out.println("Future is Cancelled");
                break;
            }
        }
        System.out.println(doubleFuture.get());
        es.shutdown();
    }
}
