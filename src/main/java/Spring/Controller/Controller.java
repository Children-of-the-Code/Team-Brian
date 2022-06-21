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
    public void registration(@RequestBody AstroUser astroUser) {
        astroUserService.registration(astroUser);
    }
    @PostMapping("login")
    public AstroUser login(@RequestBody Map<String, Object> dto) {
        return astroUserService.login(dto.get("username").toString(),dto.get("password").toString());
    }
    @PostMapping("post")
    public AstroUser createPost(@PathVariable String post) {
        return astroUserService.createPost(post);
    }
    @PostMapping("comment")
    public AstroUser postComment(@PathVariable String comment) {
        return astroUserService.postComment(comment);
    }
    @GetMapping
    public List<AstroUser> getAllUsers() {
        return astroUserService.getAllUsers();
    }
    @GetMapping("id/{id}")
    public AstroUser getUserById(@PathVariable int id) {
        return astroUserService.getUserById(id);
    }
    @GetMapping("username/{username}")
    public AstroUser getUserByUsername(@PathVariable String username) {
        return astroUserService.getUserByUsername(username);
    }
    @GetMapping("name/{firstName}")
    public AstroUser getUserByName (@PathVariable String firstName) {
        return astroUserService.getUserByName(firstName);
    }
    @GetMapping("email/{email}")
    public AstroUser getUserByEmail (@PathVariable String email) {
        return astroUserService.getUserByEmail(email);
    }
    @GetMapping("post/{post}")
    public AstroUser getUserByPost (@PathVariable String post) {
        return astroUserService.getUserByPost(post);
    }
    @GetMapping("commentExists/{username}")
    public boolean checkCommentExistsByUsername(@PathVariable String username){
        return astroUserService.checkCommentExistsByUsername( username );
    }
}
