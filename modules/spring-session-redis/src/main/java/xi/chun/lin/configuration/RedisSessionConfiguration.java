package xi.chun.lin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Lin.XiChun on 2018/9/26.
 * EnableRedisHttpSession 这个注解就是最重要的东西，加了它之后，spring生产一个新的拦截器，用来实现Session共享的操作
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfiguration {
    @Bean
    public JedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }
}
