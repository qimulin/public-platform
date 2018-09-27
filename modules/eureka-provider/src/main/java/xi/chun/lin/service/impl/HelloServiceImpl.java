package xi.chun.lin.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xi.chun.lin.service.HelloService;

/**
 * Created by Lin.XiChun on 2018/7/9.
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Value("${server.port}")
    String port;

    @Override
    public String hiService(String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @Override
    public String helloService(String name) {
        return "hello "+name+",i am from port:" +port;
    }
}
