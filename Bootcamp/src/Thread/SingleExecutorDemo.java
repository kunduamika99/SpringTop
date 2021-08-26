package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(()->{
            System.out.println("First Task: "+ Math.random()+ " Thread ID: "+Thread.currentThread().getId() );
        });
        executorService.execute(()->{
            System.out.println("Second Task: "+ Math.random()+ " Thread ID: "+Thread.currentThread().getId() );
        });
        executorService.execute(()->{
            System.out.println("Third Task: "+ Math.random()+ " Thread ID: "+Thread.currentThread().getId() );
        });


        Callable<Integer> call1 = ()->{return 1;};
        Callable<Integer> call2 = ()->{return 2;};
        Callable<Integer> call3 = ()->{return 3;};

        List<Callable<Integer>> callables = new ArrayList<Callable<Integer>>();
        callables.add(call1);
        callables.add(call2);
        callables.add(call3);

        try{
            Thread.sleep(100);
            System.out.println(executorService.invokeAny(callables));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }


    }
}
