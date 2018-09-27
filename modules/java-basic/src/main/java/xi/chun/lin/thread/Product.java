package xi.chun.lin.thread;

/**
 * 产品类
 * Created by Lin.XiChun on 2018/7/11.
 */
public class Product {

    private final static int MIN_PRODUCT = 0;
    private final static int MAX_PRODUCT = 100;
    private int productNum; // 已经生产的产品数

    Product(int productNum){
        this.productNum = productNum;
    }

    /**
     * 消费者从店员取产品
     */
    public synchronized void consume()
    {
        if(this.productNum <= MIN_PRODUCT)
        {
            try
            {
                wait();
                System.out.println("缺货,稍候再取");
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            return;
        }

        System.out.println("消费者取走了第" + this.productNum + "个产品.");
        this.productNum--;
        notifyAll();   //通知等待去的生产者可以生产产品了
    }

    /**
     * 生产者生产出来的产品交给店员
     */
    public synchronized void produce()
    {
        if(this.productNum >= MAX_PRODUCT)
        {
            try
            {
                wait();
                System.out.println("产品已满,请稍候再生产");
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            return;
        }

        this.productNum++;
        System.out.println("生产者生产第" + this.productNum + "个产品.");
        notifyAll();   //通知等待区的消费者可以取出产品了
    }
}
