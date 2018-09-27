package xi.chun.lin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Lin.XiChun on 2018/5/3.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    String port;

    @HystrixCommand(fallbackMethod = "hiServiceFallback")
    public String hiService(String name) {
        System.out.println();
        return restTemplate.getForObject("http://eureka-provider/hi?name="+(port+" to "+name),String.class);
    }

    /**
     * 注意：备用方法 和 原方法 的参数个数，类型必须相同，否则会报错
     * */
    public String hiServiceFallback(String name) {
        return "error";
    }

}
