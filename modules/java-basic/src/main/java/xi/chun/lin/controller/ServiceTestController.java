package xi.chun.lin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import xi.chun.lin.service.TestService;

import javax.annotation.Resource;

/**
 * 当面临一个service多个实现类的时候，可以如下处理。
 * Created by Lin.XiChun on 2018/9/19.
 */
@RestController("/")
public class ServiceTestController {

    /* 做法1：
       @Resource
       private TestService testServiceImpl;
       @Resource
       private TestService testServiceImpl1;*/

    /**
     * 做法2：
     * */
    @Autowired
    @Qualifier("testServiceImpl")
    private TestService testService1;

    @Resource(name = "testServiceImpl1")
    private TestService testService2;
}
