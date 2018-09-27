package xi.chun.lin.service.impl;

import org.springframework.stereotype.Service;
import xi.chun.lin.service.TestService;

/**
 * Created by Lin.XiChun on 2018/9/19.
 */
@Service
public class TestServiceImpl implements TestService{

    @Override
    public void test() {
        System.out.println("测试");
    }
}
