package xi.chun.lin.service.impl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Service;
import xi.chun.lin.service.TestService;

/**
 * Created by Lin.XiChun on 2018/9/19.
 */
@Service
public class TestServiceImpl1 implements TestService{

    @Override
    public void test() {
        System.out.println("测试-1");
    }
}
