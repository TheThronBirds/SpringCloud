package consumer.controller;

import consumer.domain.Guest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("user/{id}")
    public Guest findById(@PathVariable int id){
        return this.restTemplate.getForObject("http://microservice-provider/"+id,Guest.class);
    }

    @GetMapping("/log-user-instance")
    public void LogUserInstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider");

        log.info("{}:{}:{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort());
    }
}
