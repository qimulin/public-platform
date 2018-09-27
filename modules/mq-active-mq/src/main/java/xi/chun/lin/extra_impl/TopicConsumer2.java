package xi.chun.lin.extra_impl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by Lin.XiChun on 2018/9/25.
 */
@Component
public class TopicConsumer2 {
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "mytest.topic")
    public void receiveTopic(String text) {
        System.out.println("TopicConsumer2收到的topic报文为:"+text);
    }
}
