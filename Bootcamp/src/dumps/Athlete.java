package dumps;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class Athlete {
    int stroke = 0;
    public synchronized void swimming() {
        stroke++; }
    private int getStroke() {
        synchronized(this) { return stroke; }
    }
    public static void main(String... laps) throws Exception{
        ExecutorService s =
                Executors.newFixedThreadPool(10);
        Athlete a = new Athlete();
        for(int i=0; i<1000; i++) {
            s.execute(() -> a.swimming());
        }
        s.shutdown();
        s.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.print(a.getStroke()); }}


