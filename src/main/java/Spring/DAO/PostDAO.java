package Spring.DAO;

import Spring.Model.AstroUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostDAO extends JpaRepository<AstroUser, String> {
    @Query("FROM AstroUser WHERE post = :post")
    AstroUser getUserByPost(String post);
}
