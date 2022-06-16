package Spring.DAO;

import Spring.Model.User;
import org.springframework.data.jpa.repository.Query;

public interface CommentDAO {
    @Query("FROM User WHERE comment = :comment")
    User postComment(String comment);
}
