package xi.chun.lin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xi.chun.lin.service.impl.SchedualServiceHystrix;


/**
 * Created by Lin.XiChun on 2018/5/3.
 * 使用@FeignClient("eureka-provider")注解来绑定该接口对应eureka-provider服务
 * 通过Spring MVC的注解来配置eureka-provider服务下的具体实现
 * 使用@FeignClient注解中的fallback属性指定回调类
 */
@FeignClient(value = "eureka-provider", fallback = SchedualServiceHystrix.class)
public interface SchedualService {

    /* 记住：这里不能忘记，和controller里面的可不同 */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}