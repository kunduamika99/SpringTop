package Threads;

class TicketBooking {
    private static int seats_available=50;
    private static int seat =50;
    static Object lock = new Object();

    public synchronized static void bookTicket(){
        System.out.println("Seats available before = " + seats_available + "\tBooked By: "+ Thread.currentThread().getId());
        seats_available--;
        System.out.println("Seats available after = " + seats_available + "\tViewed By: "+ Thread.currentThread().getId());

    }

    public static void Tickets(){
        synchronized (lock){
            int current = seat;
            System.out.println("Lock Seats available before = " + seat + "\tBooked By: "+ Thread.currentThread().getId());
            seat = current-1;
            System.out.println("Lock Seats available after = " + seat + "\tViewed By: "+ Thread.currentThread().getId());

        }
    }

}

public class SynchronizeDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            Thread t = new Thread(()-> TicketBooking.bookTicket());
//            t.start();
//        }

        System.out.println("**************************");
        for (int i = 0; i <10 ; i++) {
            Thread t = new Thread(()->TicketBooking.Tickets());
            t.start();
        }
    }
}
