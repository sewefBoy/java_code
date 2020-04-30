package thread.pool.ScheduleThreadPoolExecutor;

import thread.pool.MyRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduleExecutor {
    public static void main(String[] args) {
        /**
         * 创建一个单线程执行程序，它可安排在给定延时后运行命令或者定期的执行
         * 特征：
         * 1.线程池中最多执行1个线程，之后提交的线程活动将会排在队列中依次执行
         * 2.可定时或者延时执行线程活动
         */
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        for(int i=0;i<20; i++) {
            executorService.schedule(new MyRunnable(i),3, TimeUnit.SECONDS);
        }
        executorService.shutdown();
    }
}
