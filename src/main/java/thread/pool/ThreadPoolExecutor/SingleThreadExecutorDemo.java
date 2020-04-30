package thread.pool.ThreadPoolExecutor;

import thread.pool.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        /**
         *创建一个使用单个worker线程的Executor,以无界队列方式来运行该线程，（注意，如果因为在关闭前的执行期间出现失败而终止了此单个线程，那么如果需要，
         * 一个新的线程将代替它执行后续的任务）。可保证顺序的执行各个任务，并且在任意给定的时间不会有多个线程是活动的。与其他等效的NewFixedThreadPool(1)
         * 不同，可保证无需重新配置此方法所返回的执行程序即可使用其他的线程。
         * 特征：
         * 1.线程池中最多执行一个线程，之后提交的线程活动将会排在队列中依次执行
         *
         */
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0;i<20; i++) {
            executorService.execute(new MyRunnable(i));
        }
        executorService.shutdown();
    }
}
