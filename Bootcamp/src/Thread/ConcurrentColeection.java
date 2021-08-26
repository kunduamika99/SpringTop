package Thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConcurrentColeection {
    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<String, String>();
        Map<String,String> map = new ConcurrentHashMap<String, String>();
        map.put("John","Java");
        map.put("Jenny","PHP");
        for (String k : map.keySet()) {
            System.out.println(map.get(k));
            map.remove(k);
        }
        BlockingQueue<Integer> nums = new LinkedBlockingQueue<Integer>();
        nums.offer(10);
        nums.poll();
        nums.offer(20);
        try {
            nums.offer(10,100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            nums.poll(100,TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
