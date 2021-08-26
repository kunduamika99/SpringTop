package dumps;

import demo.learn.TicketTaker;

import java.util.Comparator;
import java.util.function.*;


public class annot {
    private static int AT_CAPACITY = 100;

    public int takeTicket(int currentCount, IntUnaryOperator counter) {
        return counter.applyAsInt(currentCount);
    }

    public static void main(String... theater) {

    }

}

