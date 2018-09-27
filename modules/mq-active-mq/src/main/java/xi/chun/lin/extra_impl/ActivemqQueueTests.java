package xi.chun.lin.extra_impl;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

/**
 * Created by Lin.XiChun on 2018/9/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivemqQueueTests {

    @Autowired
    private QueueProducer producer;

    @Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQQueue("mytest.queue");
        for(int i=0; i<10; i++){
            producer.sendMessage(destination, "myname is Flytiger" + i);
        }
    }
}