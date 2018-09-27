package xi.chun.lin.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xi.chun.lin.annotation.Lxcation;

/**
 * Created by Lin.XiChun on 2018/7/18.
 */
@RestController("/")
public class AnnotationTestController {

    @RequestMapping("/test1")
    @Lxcation("lxc-test1")
    public String test1(@RequestParam("arg") String arg) throws Throwable{
        System.err.println("out test1："+(arg+2/0));
        return arg;
    }

    @RequestMapping("/test2")
//    @Lxcation("lxc-test2")
    public String test2(@RequestParam("arg") String arg) {
        System.err.println("out test2："+arg);
        return arg;
    }

}
