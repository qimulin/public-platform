package xi.chun.lin.publisher_subscriber_model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.jms.ConnectionFactory;

/**
 * 生产者/消费者模式
 * Created by Lin.XiChun on 2018/9/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MqModelTest {

    @Resource
    private Publisher publisher;

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            publisher.publish("test.topic", "Topic Message " + i);
        }
    }
}
