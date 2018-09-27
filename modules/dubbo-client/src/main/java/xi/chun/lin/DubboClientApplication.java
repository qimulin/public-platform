package xi.chun.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import xi.chun.lin.service.DemoService;

@SpringBootApplication
public class DubboClientApplication {

	public static void main(String[] args) {
		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		SpringApplication.run(DubboClientApplication.class, args);
	}
}
