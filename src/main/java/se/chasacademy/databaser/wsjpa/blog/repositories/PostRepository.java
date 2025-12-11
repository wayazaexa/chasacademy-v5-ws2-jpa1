package se.chasacademy.databaser.wsjpa.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.wsjpa.blog.models.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    // Hämta alla publicerade inlägg
    List<Post> findByPublishDateIsNotNull();

}