package thread;

public class TicketRunnable {
    public static void main(String[] args) {
        int ticket = 10;
        Ticket ticketObj = new Ticket(ticket);
        Thread t1 = new Thread(ticketObj,"A");
        Thread t2 = new Thread(ticketObj,"B");
        Thread t3 = new Thread(ticketObj,"C");
        Thread t4 = new Thread(ticketObj,"D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Ticket implements Runnable {
    int ticket;
    Ticket(int ticket){
       this.ticket = ticket;
    }
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket-- + "张票");
                }
            }
        }
    }
}
