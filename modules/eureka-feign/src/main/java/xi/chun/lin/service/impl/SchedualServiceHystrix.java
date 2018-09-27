package xi.chun.lin.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import xi.chun.lin.service.SchedualService;

/**
 * Created by Lin.XiChun on 2018/7/9.
 */
@Component
public class SchedualServiceHystrix implements SchedualService{

    @Override
    public String hi(String name) {
        return "哎呀！断了…"+name;
    }
}
