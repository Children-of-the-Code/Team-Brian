package Spring.Service;

import Spring.DAO.CommentDAO;
import Spring.DAO.PostDAO;
import Spring.DAO.AstroUserDAO;
import Spring.Model.AstroUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AstroUserService {
    AstroUserDAO astroUserDAO;
    CommentDAO commentDAO;
    PostDAO postDAO;
    @Autowired
    public List<AstroUser> getAllUsers() {
        return astroUserDAO.getAllUsers();
    }
    public void registration(AstroUser astroUser){
        String username = astroUser.getUsername();
        AstroUser temp = astroUserDAO.getUserByUsername(username);
        if(temp == null) {
            astroUserDAO.save(astroUser);
        }
    }
    public AstroUser login(String username, String password){
        AstroUser astroUser = astroUserDAO.login(username, password);
        if(astroUser != null) {
            return astroUser;
        } else {
            return null;
        }
    }
    public static AstroUser createPost(String post){
        return AstroUserService.createPost(post);
    }
    public AstroUserService(AstroUserDAO astroUserDAO){
        this.astroUserDAO = astroUserDAO;
    }
    public AstroUser getUserById(int id) {
        return astroUserDAO.getUserById(id);
    }
    public AstroUser getUserByUsername(String username) {
        return astroUserDAO.getUserByUsername(username);
    }
    public AstroUser getUserByName(String firstName) {
        return astroUserDAO.getUserByName(firstName);
    }
    public AstroUser getUserByEmail(String email) {
        return astroUserDAO.getUserByEmail(email);
    }
    public AstroUser getUserByPost(String post){
        return postDAO.getUserByPost(post);
    }
    public AstroUser postComment(String comment){
        return commentDAO.postComment(comment);
    }
    public boolean checkCommentExistsByUsername(String username){
        if(username == null){
            return true;
        }else{
            return false;
        }
    }
}
