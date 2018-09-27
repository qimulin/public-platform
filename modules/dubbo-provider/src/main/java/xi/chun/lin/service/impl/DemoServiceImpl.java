package xi.chun.lin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import xi.chun.lin.service.DemoService;

/**
 * Created by Lin.XiChun on 2018/6/30.
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Value("${server.port}")
    private String server_port;    // 对接Jira接口地址

    @Override
    public String hello(String name) {
        return "From "+server_port+" Spring-Boot-Starter Provider, Hello "+name;
    }
}
