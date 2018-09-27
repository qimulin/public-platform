package xi.chun.lin.producer_consumer_model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 生产者/消费者模式
 * Created by Lin.XiChun on 2018/9/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MqModelTest {

    @Resource
    private Producer producer;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 10; i++) {
            producer.sendMsg("test.queue", "Queue Message " + i);
        }
    }
}
