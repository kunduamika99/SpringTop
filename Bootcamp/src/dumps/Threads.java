package dumps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        var original = new ArrayList<Integer>(List.of(1, 2, 3));

        var copy1 = new ArrayList<Integer>(original);
        for (Integer q : copy1)
            copy1.add(1);

        var copy2 = new CopyOnWriteArrayList<Integer>(original);
        for (Integer q : copy2)
            copy2.add(2);

        var copy3 = new LinkedBlockingQueue<Integer>(original);
        for (Integer q : copy3)
            copy3.offer(3);

        var copy4 = Collections.synchronizedList(original);
        for (Integer q : copy4)
            copy4.add(4);

        System.out.println(original);
        System.out.println(copy1);
        System.out.println(copy2);
        System.out.println(copy3);
        System.out.println(copy4);

    }
}
