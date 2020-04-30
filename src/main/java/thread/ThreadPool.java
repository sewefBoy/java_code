package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool<main> {
    public static void main(String[] args) {
        //创建线程池，容量是3
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        //主线程创建4个任务
        for (int i = 1; i < 5; i++) {
            final int taskID = i;
            //任务加入线程池，让线程池内的线程去执行每一个任务
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        try {
                            Thread.sleep(500);
                            Thread.sleep(500); //为了测试出效果，让每次任务执行都需要一定时间
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //任务执行结束后打印一句话
                        System.out.println("第" + taskID + " 个任务的第" + i + " 次执行");
                    }
                }
            });
        }
        threadPool.shutdown();
        System.out.println("主线程执行结束");
    }
}
