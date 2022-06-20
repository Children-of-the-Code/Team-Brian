package Spring.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "astroUsers")
public class AstroUser {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int astroUser_ID;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String username;
    @Column
    private String password;
    @OneToMany
    @JoinColumn(name = "comment_ID")
    @JsonIgnoreProperties(value = {"astroUser"})
    List<Comment> comments;
}
