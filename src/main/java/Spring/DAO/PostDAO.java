package Spring.DAO;

import Spring.Model.User;
import org.springframework.data.jpa.repository.Query;

public interface PostDAO {
    @Query("FROM User WHERE post = :post")
    User getUserByPost(String post);
}
