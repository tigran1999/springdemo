package springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    @NotEmpty(message = "name can not be empty")
    private String name;

    @Column
    @NotEmpty(message = "surname can not be empty")
    private String surname;

    @Column
    @Email(message = "email can not be empty or email is not valid")
    private String email;

    @Column
    @NotEmpty(message = "password can not be empty")
    private String password;

    @Column(name = "pic_url")
    private String picUrl;

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    private UserType userType;

}
