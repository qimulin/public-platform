package xi.chun.lin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableDiscoveryClient
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${demo.param1}")
	private String param1;

	@Value("${demo.param2}")
	private String param2;

	@RequestMapping(value = "/demo")
	public String demo(){
		return param1 +" and "+param2;
	}

}
