package DAO;

import Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Integer> {
    @Query("FROM User WHERE username = :username")
    User getUserByUsername(@Param("username") String username);
    @Query("FROM User WHERE firstName = :firstName")
    User getUserByName(@Param("firstName") String firstName);
    @Query("FROM User WHERE id = :id")
    User getUserById(@Param("id") int id);
    @Query("FROM User")
    List<User> getAllUsers();
}
