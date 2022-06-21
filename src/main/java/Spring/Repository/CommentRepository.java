package Spring.Repository;

import Spring.Model.AstroUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommentRepository extends JpaRepository<AstroUser, String> {
    @Query("FROM AstroUser WHERE comment = :comment")
    AstroUser postComment(String comment);
}