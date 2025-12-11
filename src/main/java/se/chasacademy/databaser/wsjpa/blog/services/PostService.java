package se.chasacademy.databaser.wsjpa.blog.services;

import org.springframework.stereotype.Service;
import se.chasacademy.databaser.wsjpa.blog.models.Comment;
import se.chasacademy.databaser.wsjpa.blog.models.Post;
import se.chasacademy.databaser.wsjpa.blog.repositories.CommentRepository;
import se.chasacademy.databaser.wsjpa.blog.repositories.PostRepository;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public PostService(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public List<Post> getPublishedPosts() {
        return postRepository.findByPublishDateIsNotNull();
    }

    public List<Comment> getCommentsForPost(Long postId) {
        return commentRepository.findByPostPostId(postId);
    }
}
