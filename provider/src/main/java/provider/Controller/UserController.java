package provider.Controller;

import provider.Dao.UserRepository;
import provider.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Guest findById(@PathVariable int id){
        Guest user = this.userRepository.findOne(id);
        return user;
    }
}
