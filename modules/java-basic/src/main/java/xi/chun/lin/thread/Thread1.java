package xi.chun.lin.thread;

/**
 * Created by Lin.XiChun on 2018/7/11.
 * 用于代码块
 *
 */
public class Thread1 implements Runnable {

    String threadId;   // 线程编号
    Object lock;

    Thread1(String threadId){
        this.threadId = threadId;
    }

    public void run() {
        /**
         * synchronized块中的方法获取了lock实例的monitor，
         * 如果实例相同，那么只有一个线程能执行该块内容
         * */
        synchronized(lock){
            System.out.println("do thread1，id="
                    +this.threadId+",lock="+this.lock);
        }
    }
}
