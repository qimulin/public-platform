package xi.chun.lin.thread;

/**
 * Created by Lin.XiChun on 2018/7/11.
 * 直接用于方法
 */
public class Thread2 implements Runnable {

    String threadId;   // 线程编号

    Thread2(String threadId){
        this.threadId = threadId;
    }

    /**
     * 相当于Thread1代码中用lock来锁定的效果，实际获取的是Thread1类的monitor。
     * 更进一步，如果修饰的是static方法，则锁定该类所有实例。
     * */
    public synchronized void run() {
        System.out.println("do thread2，id="+threadId);
    }
}
