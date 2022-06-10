package Controller;

import DAO.UserDAO;
import Model.User;
import Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Users")
public class Controller {
    Service service;
    UserDAO userDAO;
    @Autowired
    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping("register")
    public User registration(@RequestParam String firstName, String lastName, String username, String password){
        return service.registration(firstName, lastName, username, password );
    }
    @GetMapping("login")
    public User login(@PathVariable String username, String password){
        return service.login(username, password );
    }
    @PostMapping("post")
    public User createPost(@PathVariable String post){
        return service.createPost(post);
    }
    @GetMapping("")
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    @GetMapping("id/{id}")
    public User getUserById(@PathVariable int id) {
        return service.getUserById(id);
    }
    @GetMapping("username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return service.getUserByUsername(username);
    }
    @GetMapping("firstName/{firstName}")
    public User getUserByName (@PathVariable String firstName) {
        return service.getUserByName(firstName);
    }
    @GetMapping("post/{post}")
    public User getUserByPost (@PathVariable String post){
        return service.getUserByPost(post);
    }
    @PostMapping("comment")
    public User postComment (@PathVariable String comment){
        return service.postComment(comment);
    }
    @GetMapping("commentExists/{username}")
    public boolean checkCommentExistsByUsername(@PathVariable String username){
        return service.checkCommentExistsByUsername( username );
    }
}
