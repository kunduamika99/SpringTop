package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallThread implements Callable<String>{


    @Override
    public String call() throws Exception {
        System.out.println("In call method");
        return "Returning somthing";
    }
}

public class CallThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(()-> {

            try {
                System.out.println(new CallThread().call() +"\tID : "+ Thread.currentThread().getId()+ " Runnable Method 1");
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        es.execute(()-> {

            try {
                System.out.println(new CallThread().call() +"\tID : "+ Thread.currentThread().getId()+ " Runnable Method 2");
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        es.execute(()-> {

            try {
                System.out.println(new CallThread().call() +"\tID : "+ Thread.currentThread().getId()+ " Runnable Method 3");
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        es.shutdown(); //to shutdown service

        ExecutorService ess = Executors.newSingleThreadExecutor();
        Future<String> result = ess.submit(new CallThread());

        System.out.println(result.get()+" Callable Method ");
    }
}
