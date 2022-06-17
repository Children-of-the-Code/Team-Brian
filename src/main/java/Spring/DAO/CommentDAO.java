package Spring.DAO;

import Spring.Model.AstroUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommentDAO extends JpaRepository<AstroUser, String> {
    @Query("FROM AstroUser WHERE comment = :comment")
    AstroUser postComment(String comment);
}
