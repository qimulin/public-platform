package xi.chun.lin.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xi.chun.lin.asyn.TestTask;
import xi.chun.lin.asyn.TestTaskPool;

import java.util.concurrent.Future;

/**
 * Created by Lin.XiChun on 2018/7/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAsyncApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootAsyncApplicationTests.class);

    @Autowired
    private TestTask task;

    @Autowired
    private TestTaskPool taskPool;

    @Test
    public void test() throws Exception {
//        task.taskOne();
//        task.taskTwo();
//        task.taskThree();
        long start = System.currentTimeMillis();
        Future<String> task1 = task.taskFun("1");
        Future<String> task2 = task.taskFun("2");
        Future<String> task3 = task.taskFun("3");
        while(true) {
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                task.taskLog(); // 记录日志
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("Main方法完毕！");
    }

    @Test
    public void testPool() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> task1 = taskPool.taskFun("1");
        Future<String> task2 = taskPool.taskFun("2");
        Future<String> task3 = taskPool.taskLog(task1, task2);
        long end = System.currentTimeMillis();
        logger.info("Main方法完毕！");
        System.out.println("Main方法完毕！");
    }

}
