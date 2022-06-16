package Spring.DAO;

import Spring.Model.User;
import org.springframework.data.jpa.repository.Query;

public interface PostDAO {
    @Query
    User getUserByPost(String post);
}
