package xi.chun.lin.extra_impl;

import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

/**
 * Created by Lin.XiChun on 2018/9/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivemqTopicTests {

    @Autowired
    private TopicProducer producer;

    @Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQTopic("mytest.topic");
        for(int i=0; i<3; i++){
            producer.sendMessage(destination, "myname is TopicFlytiger" + i);
        }
    }
}
