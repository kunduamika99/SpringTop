package dumps;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class Clock {
    private AtomicLong bigHand = new AtomicLong(0);

    void incrementBy10() {
        bigHand.getAndSet( 10+ bigHand.get());
    }

    public static void main(String[] c) throws Exception {
        var smartWatch = new Clock();
        ExecutorService s =
                Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            var f1 = s.submit(() ->
                    smartWatch.incrementBy10()).get();
        }
        s.shutdown();
        s.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(smartWatch.bigHand.get());
    }
}