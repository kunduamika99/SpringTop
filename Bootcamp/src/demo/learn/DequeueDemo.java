package demo.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeueDemo {
    public static void main(String[] args) {
        List<Integer> mydata = List.of(10,20,50,40,30);
        List<Integer> mdata = Arrays.asList(10,20,50,40,30);
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < mydata.size(); i++) {
            data.add(mydata.get(i));
        }
        data.remove(0);
        System.out.println(data);
//        mdata.remove(1);
        Deque<Integer> queue = new LinkedList<Integer>(mydata);
        queue.push(100);
        System.out.println(queue);
        System.out.println(queue.pop()+" " + queue);
        queue.addFirst(68);
        System.out.println(queue);
        queue.addLast(300);
        System.out.println(queue);
    }
}
