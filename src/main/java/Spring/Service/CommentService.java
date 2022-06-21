package Spring.Service;

import Spring.Model.AstroUser;
import Spring.Repository.CommentRepository;

public class CommentService {
    CommentRepository commentRepository;
    public AstroUser postComment(String comment) {
        return commentRepository.postComment(comment);
    }
    public boolean checkCommentExistsByUser(String username) {
        if(username == null) {
            return true;
        } else {
            return false;
        }
    }
}