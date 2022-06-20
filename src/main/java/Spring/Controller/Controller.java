package Spring.Controller;

import Spring.DAO.AstroUserDAO;
import Spring.Model.AstroUser;
import Spring.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Users")
public class Controller {
    Service service;
    AstroUserDAO astroUserDAO;
    @Autowired
    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping("register")
    public AstroUser registration(@RequestParam String firstName, String lastName, String username, String password){
        return service.registration(firstName, lastName, username, password );
    }
    @GetMapping("login")
    public AstroUser login(@PathVariable String username, String password){
        return service.login(username, password );
    }
    @PostMapping("post")
    public AstroUser createPost(@PathVariable String post){
        return service.createPost(post);
    }
    @GetMapping("")
    public List<AstroUser> getAllUsers() {
        return astroUserDAO.getAllUsers();
    }
    @GetMapping("id/{id}")
    public AstroUser getUserById(@PathVariable int id) {
        return service.getUserById(id);
    }
    @GetMapping("username/{username}")
    public AstroUser getUserByUsername(@PathVariable String username) {
        return service.getUserByUsername(username);
    }
    @GetMapping("firstName/{firstName}")
    public AstroUser getUserByName (@PathVariable String firstName) {
        return service.getUserByName(firstName);
    }
    @GetMapping("post/{post}")
    public AstroUser getUserByPost (@PathVariable String post){
        return service.getUserByPost(post);
    }
    @PostMapping("comment")
    public AstroUser postComment (@PathVariable String comment){
        return service.postComment(comment);
    }
    @GetMapping("commentExists/{username}")
    public boolean checkCommentExistsByUsername(@PathVariable String username){
        return service.checkCommentExistsByUsername( username );
    }
}
