package thread.pool;

public class MyRunnable implements  Runnable {
    int i;
    public  MyRunnable(int i){
        this.i = i;
    }
    @Override
    public void run() {
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+"__"+i);
    }
}
