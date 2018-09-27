package xi.chun.lin.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created by Lin.XiChun on 2018/7/13.
 */
@Component
public class TestTask {
    public static Random random =new Random();

    @Async
    public Future<String> taskFun(String idStr) throws Exception {
        System.out.println("开始执行任务:"+idStr);
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务:"+idStr+"执行时间："+(end- start));
        return new AsyncResult<>("任务:"+idStr+"完成");
    }

    @Async
    public Future<String> taskOne() throws Exception {
        System.out.println("开始执行任务一");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务一执行时间："+(end- start));
        return new AsyncResult<>("任务一完成");
    }

    @Async
    public Future<String> taskTwo() throws Exception {
        System.out.println("开始执行任务二");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务二执行时间："+(end- start));
        return new AsyncResult<>("任务二完成");
    }

    @Async
    public Future<String> taskThree() throws Exception {
        System.out.println("开始执行任务三");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务三执行时间："+(end- start));
        return new AsyncResult<>("任务三完成");
    }

    public void taskLog() throws Exception {
        System.out.println("开始执行记日志");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("执行日志记录："+(end- start));
    }

}
