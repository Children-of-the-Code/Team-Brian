package Spring.Service;

import Spring.DAO.UserDAO;
import Spring.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
    public static User registration(String firstName, String lastName, String username, String password ){
        return Service.registration( firstName, lastName, username, password );
    }
    public static User login(String username, String password){
        return Service.login( username, password );
    }
    public static User createPost(String post){
        return Service.createPost( post );
    }
    UserDAO userDAO;
    public Service(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Autowired
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }
    public User getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }
    public User getUserByName(String name) {
        return userDAO.getUserByName(name);
    }
    public User getUserByPost(String post){
        return userDAO.getUserByPost(post);
    }
    public User postComment(String comment){
        return userDAO.postComment(comment);
    }
    public boolean checkCommentExistsByUsername(String username){
        if(username == null){
            return true;
        }else{
            return false;
        }
    }
}
