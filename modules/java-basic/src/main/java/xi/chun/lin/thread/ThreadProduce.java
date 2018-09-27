package xi.chun.lin.thread;

/**
 * Created by Lin.XiChun on 2018/7/11.
 * 生产者线程
 */
public class ThreadProduce implements Runnable {

    private Product product;

    public ThreadProduce(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for( int i=0;i<10;i++)
        {
            try {
                System.out.println("pro  i:" +i);
                Thread. sleep(30);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

            product.produce();
        }
    }
}
