package springdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import springdemo.model.Post;


public interface PostRepository extends JpaRepository<Post, Integer> {

}
