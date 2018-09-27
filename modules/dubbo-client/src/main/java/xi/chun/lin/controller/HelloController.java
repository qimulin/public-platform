package xi.chun.lin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xi.chun.lin.service.DemoService;

/**
 * Created by Lin.XiChun on 2018/6/30.
 */
@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping(value = "/hello")
    public String index() {
        return demoService.hello("Handsome Boy");
    }
}
