package xi.chun.lin.thread;

/**
 * Created by Lin.XiChun on 2018/7/11.
 * 消费者线程
 */
public class ThreadConsume implements Runnable {

    private Product product;

    public ThreadConsume(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for( int i=0;i<10;i++)
        {
            try {
                System.out.println("Con: i " +i);
                Thread.sleep(3000);                // 这里设置跟上面30不同是为了 产品能够增加，不会生产一个马上被消费
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            product.consume();
        }
    }
}
