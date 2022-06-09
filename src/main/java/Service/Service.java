package Service;

import DAO.UserDAO;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {

    UserDAO userDAO;

    @Autowired
    public Service(UserDAO userDAO){
        this.userDAO = userDAO;
    }

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
}
