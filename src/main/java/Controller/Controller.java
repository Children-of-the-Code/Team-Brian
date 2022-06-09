package Controller;

import Model.User;
import Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Users")
public class Controller {
    Service service;
    @Autowired
    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping("")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    @GetMapping("{id}")
    public User getUserById(@PathVariable int id) {
        return service.getUserById(id);
    }
    @GetMapping("{username}")
    public User getUserByUsername(@PathVariable String username) {
        return service.getUserByUsername(username);
    }
    @GetMapping("{name}")
    public User getUserByName (@PathVariable String name) {
        return service.getUserByName(name);
    }
}
