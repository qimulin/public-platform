package xi.chun.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注解@EnableEurekaClient 表明自己是一个eurekaclient.
 * 在主类中通过加上@EnableDiscoveryClient注解，
 * 该注解能激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出
 * */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}

}
