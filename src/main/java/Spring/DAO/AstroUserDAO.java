package Spring.DAO;

import Spring.Model.AstroUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AstroUserDAO extends JpaRepository<AstroUser, Integer> {
    @Query("FROM AstroUser WHERE username = :username")
    AstroUser getUserByUsername(@Param("username") String username);
    @Query("FROM AstroUser WHERE firstName = :firstName")
    AstroUser getUserByName(@Param("firstName") String firstName);
    @Query("FROM AstroUser WHERE id = :id")
    AstroUser getUserById(@Param("id") int id);
    @Query("FROM AstroUser")
    List<AstroUser> getAllUsers();
}
