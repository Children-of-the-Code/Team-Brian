package Spring.Service;

import Spring.DAO.CommentDAO;
import Spring.DAO.PostDAO;
import Spring.DAO.UserDAO;
import Spring.Model.AstroUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
    public static AstroUser registration(String firstName, String lastName, String username, String password ){
        return Service.registration( firstName, lastName, username, password );
    }
    public static AstroUser login(String username, String password){
        return Service.login( username, password );
    }
    public static AstroUser createPost(String post){
        return Service.createPost( post );
    }
    CommentDAO commentDAO;
    PostDAO postDAO;
    UserDAO userDAO;
    public Service(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Autowired
    public List<AstroUser> getAllUsers() {
        return userDAO.getAllUsers();
    }
    public AstroUser getUserById(int id) {
        return userDAO.getUserById(id);
    }
    public AstroUser getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }
    public AstroUser getUserByName(String name) {
        return userDAO.getUserByName(name);
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
