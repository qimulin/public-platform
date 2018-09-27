package xi.chun.lin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xi.chun.lin.service.SchedualService;

/**
 * Created by Lin.XiChun on 2018/5/3.
 */
@RestController
public class HiController {

    @Autowired
    SchedualService schedualService;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualService.hi(port+" to "+name);
    }
}