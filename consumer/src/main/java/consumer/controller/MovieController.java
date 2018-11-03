package consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import consumer.domain.Guest;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("user/{id}")
    public Guest findById(@PathVariable int id){
        return this.restTemplate.getForObject("http://localhost:8000/"+id,Guest.class);
    }
}
