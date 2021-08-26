package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleSubmitDemo {
    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static Future<Double> getRandom(){
        return executorService.submit(()->{
                return Math.random();
        });
    }
    public static void main(String[] args) {
        Future<Double> doubleFuture = getRandom();
        while (!doubleFuture.isDone()){
            if(doubleFuture.isCancelled()){
                System.out.println("Future is cancelled");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println(doubleFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
