package xi.chun.lin.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xi.chun.lin.filter.TestFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lin.XiChun on 2018/6/26.
 */
@Configuration
public class MyConfiguration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        List<String> urlPatterns = new ArrayList<String>();

        TestFilter testFilter = new TestFilter();   //new过滤器
        urlPatterns.add("/Blogs");      //指定需要过滤的url
        filterRegistrationBean.setFilter(testFilter);       //set
        filterRegistrationBean.setUrlPatterns(urlPatterns);     //set

        return filterRegistrationBean;
    }
}
