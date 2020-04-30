package thread.pool.ScheduleThreadPoolExecutor;

import thread.pool.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolDemo {
    public static void main(String[] args) {
        /**
         * 创建一个线程池，它可安排在给定延迟后运行命令或者定期的执行
         * 特征：
         * 1.线程池中具有指定数量的线程，即便是空线程也将保留
         * 2.可定时或者延时执行线程活动
         */
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        for(int i=0;i<20; i++) {
            service.schedule(new MyRunnable(i), 3, TimeUnit.SECONDS);
        }
        service.shutdown();
    }
}
