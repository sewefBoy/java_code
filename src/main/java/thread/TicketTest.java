package thread;

public class TicketTest extends Thread{

    private static int ticket = 5;

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketTest t1 = new TicketTest();
        TicketTest t2 = new TicketTest();
        TicketTest t3 = new TicketTest();
        TicketTest t4 = new TicketTest();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}