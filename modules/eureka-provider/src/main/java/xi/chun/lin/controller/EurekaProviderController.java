package xi.chun.lin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xi.chun.lin.service.HelloService;

/**
 * Created by Lin.XiChun on 2018/7/7.
 */
@RestController
public class EurekaProviderController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.helloService(name);
    }
}
