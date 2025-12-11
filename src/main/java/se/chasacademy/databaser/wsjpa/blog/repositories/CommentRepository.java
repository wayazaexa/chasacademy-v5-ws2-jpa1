package se.chasacademy.databaser.wsjpa.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.wsjpa.blog.models.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    //- hämta kommentarer per inlägg
    List<Comment> findAllByPostId(int postId);
}
