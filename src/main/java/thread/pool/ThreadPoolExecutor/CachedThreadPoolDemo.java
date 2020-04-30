package thread.pool.ThreadPoolExecutor;

import thread.pool.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        /**
         * 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们，并在需要时使用提供的ThreadFactory创建新线程。
         * 特征：
         * 1.线程池中数量没有固定，可达到最大值(Integer.MAX_VALUE)
         * 2.线程池中的线程可进行缓存重复利用和回收(回收默认时间为1分钟)
         * 3.当线程池中，没有可用线程，会重新创建一个线程
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<20; i++) {
            executorService.execute(new MyRunnable(i));
        }
        executorService.shutdown();
    }
}
