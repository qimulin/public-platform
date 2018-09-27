package xi.chun.lin.producer_consumer_model;

import org.springframework.jms.annotation.JmsListener;

/**
 * Created by Lin.XiChun on 2018/9/21.
 */
public class Consumer {
    @JmsListener(destination = "test.queue")
    public void receiveMsg(String text) {
        System.out.println("<<<<<<============ 收到消息： " + text);
    }
}
