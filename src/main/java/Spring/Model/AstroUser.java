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
public class AstroUser {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int astroUser_ID;
    @Column
    private String username;
    @OneToMany
    @JoinColumn(name = "comment_ID")
    @JsonIgnoreProperties(value = {"astroUser"})
    List<Comment> comments;
}
