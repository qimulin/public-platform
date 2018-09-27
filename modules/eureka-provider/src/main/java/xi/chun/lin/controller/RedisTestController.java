package xi.chun.lin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lin.XiChun on 2018/4/13.
 */
@RestController
public class RedisTestController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/redis-test")
    public String redisTest(@RequestParam String name) {
        return "hello "+name+",i am from port:";
    }
}
