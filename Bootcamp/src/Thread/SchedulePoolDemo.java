package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SchedulePoolDemo {
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

    public static void main(String[] args) {
        Future<Double> doubleFuture= executorService.schedule(()->{
            Thread.sleep((int)Math.random()*200);
            System.out.println(1 + " Thread ID: "+ Thread.currentThread().getId());
            return Math.random();
        },1000, TimeUnit.MILLISECONDS);

        System.out.println();
        try {
            System.out.println(doubleFuture.get(2000,TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Task Cancelled ? "+ doubleFuture.isCancelled());
            System.out.println("Task Done ? "+doubleFuture.isDone());
            executorService.shutdown();
        }
    }
}
