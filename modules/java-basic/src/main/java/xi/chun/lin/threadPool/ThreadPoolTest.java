package xi.chun.lin.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Lin.XiChun on 2018/7/16.
 */
public class ThreadPoolTest {

    private void fixedThreadFun(){

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        for(int i=0;i<=10;i++){
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("线程：" + threadName + ",正在执行第" + index + "个任务");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }


    private void scheduledThreadFun(){

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);

        //延迟2秒后执行该任务
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("schedule");
            }
        }, 2, TimeUnit.SECONDS);
        //延迟1秒后，每隔2秒执行一次该任务
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("scheduleAtFixedRate");
            }
        }, 1, 2, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
//        ThreadPoolTest t = new ThreadPoolTest();
//        t.fixedThreadFun();
//        t.scheduledThreadFun();
    }

}
