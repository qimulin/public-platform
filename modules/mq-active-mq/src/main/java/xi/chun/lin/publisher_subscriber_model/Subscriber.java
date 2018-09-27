package xi.chun.lin.publisher_subscriber_model;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by Lin.XiChun on 2018/9/21.
 */
@Service
public class Subscriber {

    @JmsListener(destination = "test.topic", containerFactory = "myJmsContainerFactory")
    public void subscribe(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
}