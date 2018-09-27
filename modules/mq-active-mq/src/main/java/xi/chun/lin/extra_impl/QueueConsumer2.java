package xi.chun.lin.extra_impl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * Created by Lin.XiChun on 2018/9/21.
 */
@Component
public class QueueConsumer2 {

    @JmsListener(destination = "mytest.queue")  // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @SendTo("out.queue")    // SendTo 该注解的意思是将return回的值，再发送的"out.queue"队列中
    public String receiveQueue(String text) {
        System.out.println("QueueConsumer2收到的报文为:"+text);
        return "return message "+text;
    }
}
