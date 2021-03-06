package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedPoolDemo {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static Future<Double> getRandom(int i){
        return executorService.submit(()->{
            Thread.sleep((int)Math.random()*200);
            System.out.println(i+ " Thread ID: "+ Thread.currentThread().getId());
            return Math.random();
        });

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            getRandom(i);
        }
    }
}
