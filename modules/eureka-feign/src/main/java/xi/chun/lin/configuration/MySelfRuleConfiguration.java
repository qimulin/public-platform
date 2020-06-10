package xi.chun.lin.configuration;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lin.xc
 * @date 2020/6/9
 */
@Configuration
public class MySelfRuleConfiguration {
    @Bean
    public IRule myRule(){
        return new MyRandomRule();
    }
}
