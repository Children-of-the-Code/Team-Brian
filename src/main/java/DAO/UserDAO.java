package DAO;

import Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Integer> {

    @Query("FROM User where username = :username")
    User getUserByUsername(@Param("username") String username);

    @Query("FROM User where name = :name")
    User getUserByName(@Param("name") String name);

    @Query("FROM User where id = :id")
    User getUserById(@Param("id") int id);

    @Query("FROM User")
    List<User> getAllUsers();
}
