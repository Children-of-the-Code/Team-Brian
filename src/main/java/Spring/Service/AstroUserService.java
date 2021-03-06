package Spring.Service;

import Spring.Repository.AstroUserRepository;
import Spring.Model.AstroUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AstroUserService {
    AstroUserRepository astroUserRepository;
    @Autowired
    public AstroUserService(AstroUserRepository astroUserRepository) {
        this.astroUserRepository = astroUserRepository;
    }
    public List<AstroUser> getAllUsers() {
        return astroUserRepository.getAllUsers();
    }
    public void registration(AstroUser astroUser) {
        String username = astroUser.getUsername();
        AstroUser temp = astroUserRepository.getUserByUsername(username);
        AstroUser temp2 = astroUserRepository.getUserByEmail(astroUser.getEmail());
        if(temp == null && temp2 == null) {
            astroUserRepository.save(astroUser);
        }
    }
    public AstroUser login(String username, String password) {
        AstroUser astroUser = astroUserRepository.login(username, password);
        if(astroUser != null) {
            return astroUser;
        } else {
            return null;
        }
    }
    public AstroUser getUserById(int id) {
        return astroUserRepository.getUserById(id);
    }
    public AstroUser getUserByUsername(String username) {
        return astroUserRepository.getUserByUsername(username);
    }
    public AstroUser getUserByName(String firstName) {
        return astroUserRepository.getUserByName(firstName);
    }
    public AstroUser getUserByEmail(String email) {
        return astroUserRepository.getUserByEmail(email);
    }
    public AstroUser getUserByPost(String post) {
        return astroUserRepository.getUserByPost(post);
    }
}