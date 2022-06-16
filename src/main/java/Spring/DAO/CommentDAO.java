package Spring.DAO;

import Spring.Model.User;
import org.springframework.data.jpa.repository.Query;

public interface CommentDAO {
    @Query
    User postComment(String comment);
}
