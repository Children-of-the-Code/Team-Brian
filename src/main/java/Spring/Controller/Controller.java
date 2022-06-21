package Spring.Controller;

import Spring.Model.AstroUser;
import Spring.Service.AstroUserService;
import Spring.Service.CommentService;
import Spring.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("astroUser")
public class Controller {
    AstroUserService astroUserService;
    CommentService commentService;
    PostService postService;
    @Autowired
    //AstroUserService
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
    //CommentService
    @PostMapping("comment")
    public AstroUser postComment(@PathVariable String comment) {
        return commentService.postComment(comment);
    }
    @GetMapping("commentExists/{username}")
    public boolean checkCommentExistsByUser(@PathVariable String username) {
        return commentService.checkCommentExistsByUser( username );
    }
    //PostService
    @PostMapping("post")
    public AstroUser createPost(@PathVariable String post) {
        return postService.createPost(post);
    }
    @GetMapping("postExists/{username}")
    public boolean checkPostExistsByUser(@PathVariable String username) {
        return postService.checkPostExistsByUser(username);
    }
}