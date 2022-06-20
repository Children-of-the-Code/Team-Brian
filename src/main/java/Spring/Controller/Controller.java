package Spring.Controller;

import Spring.Model.AstroUser;
import Spring.Service.AstroUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("astroUser")
public class Controller {
    AstroUserService astroUserService;
    @Autowired
    public Controller(AstroUserService astroUserService) {
        this.astroUserService = astroUserService;
    }
    @PostMapping("register")
    public AstroUser registration(@RequestBody String firstName, String lastName, String email, String username, String password){
        return astroUserService.registration(firstName, lastName, email, username, password);
    }
    @PostMapping("login")
    public AstroUser login(@RequestBody Map<String, Object> dto){
        return astroUserService.login(dto.get("username").toString(),dto.get("password").toString());
    }
    @PostMapping("post")
    public AstroUser createPost(@PathVariable String post){
        return astroUserService.createPost(post);
    }
    @GetMapping
    public List<AstroUser> getAllUsers() {
        return astroUserService.getAllUsers();
    }
    @GetMapping("astroUser/{id}")
    public AstroUser getUserById(@PathVariable int id) {
        return astroUserService.getUserById(id);
    }
    @GetMapping("astroUser/{username}")
    public AstroUser getUserByUsername(@PathVariable String username) {
        return astroUserService.getUserByUsername(username);
    }
    @GetMapping("astroUser/{firstName}")
    public AstroUser getUserByName (@PathVariable String firstName) {
        return astroUserService.getUserByName(firstName);
    }
    @GetMapping("astroUser/{post}")
    public AstroUser getUserByPost (@PathVariable String post){
        return astroUserService.getUserByPost(post);
    }
    @PostMapping("comment")
    public AstroUser postComment (@PathVariable String comment){
        return astroUserService.postComment(comment);
    }
    @GetMapping("commentExists/{username}")
    public boolean checkCommentExistsByUsername(@PathVariable String username){
        return astroUserService.checkCommentExistsByUsername( username );
    }
}
