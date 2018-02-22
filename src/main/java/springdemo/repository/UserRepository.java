package springdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import springdemo.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

    public User findOneByEmail(String email);


}
