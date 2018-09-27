package xi.chun.lin.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Lin.XiChun on 2018/7/16.
 */
public class MyThreadPoolTest {
    private void priorityThreadPoolFun(){
        /**
         * 创建一个基于PriorityBlockingQueue实现的线程池，为了测试方便，我这里把核心线程数量设置为3
         * */
        ExecutorService priorityThreadPool = new ThreadPoolExecutor(
                3,3,0L, TimeUnit.SECONDS,new PriorityBlockingQueue<Runnable>());
        for (int i = 1; i <= 10; i++) {
            final int priority = i;
            priorityThreadPool.execute(new PriorityRunnable(priority) {
                @Override
                public void doSth() {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("线程：" + threadName + ",正在执行优先级为：" + priority + "的任务");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void main(String[] args) {
        MyThreadPoolTest t = new MyThreadPoolTest();
        t.priorityThreadPoolFun();
    }

}
