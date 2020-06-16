package thread;

import java.util.Collections;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        CountDownLatch cdl = new CountDownLatch(threads.length);

        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(()->{
               int result = 0;
               for(int j=0;j<100;j++){
                   result += j;
               }
               cdl.countDown();
               System.out.println("运行一次  "+result);
            });
        }

        for(int i=0;i<threads.length;i++){
            threads[i].start();
        }

        try{
            System.out.println("await");
            cdl.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("end countdownlatch");
    }
}
