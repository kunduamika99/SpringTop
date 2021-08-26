package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDemo {
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);
    public static void main(String[] args) {
        int i =0;
        executorService.scheduleWithFixedDelay(()->{
            System.out.println(i+" Thread ID: " + Thread.currentThread().getId());
        }, 1000, 200, TimeUnit.MILLISECONDS);

        try {
            executorService.awaitTermination(10000,TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
