package xi.chun.lin.asyn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created by Lin.XiChun on 2018/7/13.
 */
@Component
public class TestTaskPool {

    private static final Logger logger = LoggerFactory.getLogger(TestTaskPool.class);

    public static Random random =new Random();

    @Async("taskExecutor")
    public Future<String> taskFun(String idStr) throws Exception {
        System.out.println("开始执行任务:"+idStr);logger.info("开始执行任务:"+idStr);
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务:"+idStr+"执行时间："+(end- start));logger.info("任务:"+idStr+"执行时间："+(end- start));
        return new AsyncResult<>("任务:"+idStr+"完成");
    }

    @Async("taskExecutor")
    public Future<String> taskOne() throws Exception {
        System.out.println("开始执行任务一");logger.info("开始执行任务一");
        long start=System.currentTimeMillis();
        Thread.sleep(5000);
//        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务一执行时间："+(end- start));logger.info("任务一执行时间："+(end- start));
        return new AsyncResult<>("任务一完成");
    }

    @Async("taskExecutor")
    public Future<String> taskTwo() throws Exception {
        System.out.println("开始执行任务二");logger.info("开始执行任务二");
        long start=System.currentTimeMillis();
        Thread.sleep(5000);
//        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务二执行时间："+(end- start));logger.info("任务二执行时间："+(end- start));
        return new AsyncResult<>("任务二完成");
    }

    @Async("taskExecutor")
    public Future<String> taskThree() throws Exception {
        System.out.println("开始执行任务三");logger.info("");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务三执行时间："+(end- start));logger.info("任务三执行时间："+(end- start));
        return new AsyncResult<>("任务三完成");
    }

    @Async("taskExecutor")
    public Future<String> taskLog(Future<String> taskRs1, Future<String> taskRs2) throws Exception {
        long start=System.currentTimeMillis();
        while(true){
            if(taskRs1.isDone() && taskRs2.isDone()){
                start=System.currentTimeMillis();
                System.out.println("开始执行记日志");
//                logger.info("开始执行记日志");
                break;  // 跳出while循环
            }
        }
//        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        logger.info("执行日志记录："+(end- start));
        logger.info("同方法内日志使用次数测试-1");
        System.out.println("执行日志记录："+(end- start));
        logger.info("同方法内日志使用次数测试-2");
        return new AsyncResult<>("日志记录完成");

    }

}
