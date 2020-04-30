package thread.test;

public class shangji1 {
    public static void main(String[] args) {
//        PrintOuShu printOuShu = new PrintOuShu();
//        PrintJiShu printJiShu = new PrintJiShu();
//        Thread t1 = new Thread(printOuShu);
//        Thread t2 = new Thread(printJiShu);
//        Thread t3 = new Thread(printOuShu);
//        Thread t4 = new Thread(printOuShu);
//        t2.start();
//        t1.start();
//        t3.start();
//        t4.start();


//        TicketThread tt = new TicketThread();
//        new Thread(tt).start();
//        new Thread(tt).start();
//        new Thread(tt).start();
//        sleepTest();
        yieldTest();
    }

    /**
     * join方法
     */
    static void joinTest(){
        Thread t1 = new Thread(()->{
            for(int i=0;i<20;i++){
                System.out.println(Thread.currentThread().getName()+": A "+i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<20;i++){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+": B "+i);
            }
        });
        t1.start();
        t2.start();
    }
    /**
     * sleep方法
     */
    static void sleepTest(){
        new Thread(()->{
            for(int i=0;i<20;i++){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+": A "+i);
            }
        }).start();

        new Thread(()->{
            for(int i=0;i<20;i++){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+": B "+i);
            }
        }).start();
    }

    /**
     * yield方法
     */
    static void yieldTest(){
        new Thread(()->{
            for(int i=0;i<20;i++){

                System.out.println(Thread.currentThread().getName()+": A "+i);
            }
        }).start();

        new Thread(()->{
            for(int i=0;i<20;i++){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+": B "+i);
            }
        }).start();
    }

}

class TicketThread implements Runnable{
    private int tick = 5;
    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (tick > 0) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "--买票：第" + tick-- + "张");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class PrintOuShu implements Runnable{
    public PrintOuShu() {
    }

    public void run(){
//        synchronized (PrintOuShu.class){
            for(int i=0;i<=100;i++){
                if(i%2 == 0){
                    System.out.println(Thread.currentThread().getName()+"----"+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
//        }
    }
}


class PrintJiShu implements Runnable{
    public PrintJiShu() {
    }

    public void run(){
//        synchronized (PrintOuShu.class){
        for(int i=0;i<=100;i++){
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName()+"----"+i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
//        }
    }
}