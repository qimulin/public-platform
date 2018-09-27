package xi.chun.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import xi.chun.lin.interceptor.MyInterceptor;

@SpringBootApplication
public class PublicPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicPlatformApplication.class, args);
//		if(true==true) System.out.println("Sonar检测判断");
	}

	//mvc控制器
	@Configuration
	static class WebMvcConfigurer extends WebMvcConfigurerAdapter {
		//增加拦截器
		public void addInterceptors(InterceptorRegistry registry){
			registry.addInterceptor(new MyInterceptor())    //指定拦截器类
					.addPathPatterns("/Blogs");        //指定该类拦截的url
		}
	}
}
