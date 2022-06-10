package Service;

import Model.User;

import java.util.List;

public class Service {
    public static User registration(String firstName, String lastName, String username,String password ){

        return Service.registration( firstName, lastName, username, password );
    }
    public static User login(String username, String password){
        return Service.login( username, password );
    }
    public static User createPost(String post){
        return Service.createPost( post );
    }
    public static List<User> getAllUsers() {
        return Service.getAllUsers();
    }
    public static User getUserById(int id) {
        return Service.getUserById(id);
    }
    public static User getUserByUsername(String username) {
        return Service.getUserByUsername(username);
    }
    public static User getUserByName(String name) {
        return Service.getUserByName(name);
    }
    public static User getUserByPost(String post){
        return Service.getUserByPost( post );
    }
    public static User postComment(String comment){
        return Service.postComment( comment );
    }
    public boolean checkCommentExistsByUsername(String username){
        if(username == null){
            return true;
        }else{
            return false;
        }
    }
}
