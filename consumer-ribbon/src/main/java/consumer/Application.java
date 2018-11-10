package consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 包名称consumer
 * 类名称Application
 * 类描述 TODO
 * 创建人luzejin
 * 创建时间2018/11/6 22:29
 **/
public class Application {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}