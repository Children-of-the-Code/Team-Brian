package Spring.Repository;

import Spring.Model.AstroUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AstroUserRepository extends JpaRepository<AstroUser, Integer> {
    @Query("FROM AstroUser WHERE username = :username and password = :password")
    AstroUser login(@Param("username")String username, @Param("password")String password);
    @Query("FROM AstroUser")
    List<AstroUser> getAllUsers();
    @Query("FROM AstroUser WHERE id = :id")
    AstroUser getUserById(@Param("id")int id);
    @Query("FROM AstroUser WHERE username = :username")
    AstroUser getUserByUsername(@Param("username")String username);
    @Query("FROM AstroUser WHERE firstName = :firstName")
    AstroUser getUserByName(@Param("firstName")String firstName);
    @Query("FROM AstroUser WHERE email = :email")
    AstroUser getUserByEmail(@Param("email")String email);
    @Query("FROM AstroUser WHERE post = :post")
    AstroUser createPost(@Param("post")String post);
}
