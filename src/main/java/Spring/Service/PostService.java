package Spring.Service;

import Spring.Model.AstroUser;
import Spring.Repository.PostRepository;

public class PostService {
    PostRepository postRepository;
    public AstroUser createPost(String post) {
        return postRepository.createPost(post);
    }
    public boolean checkPostExistsByUser(String username) {
        if(username == null){
            return true;
        }else{
            return false;
        }
    }
}