package se.chasacademy.databaser.wsjpa.blog.services;

import org.springframework.stereotype.Service;
import se.chasacademy.databaser.wsjpa.blog.models.Post;
import se.chasacademy.databaser.wsjpa.blog.repositories.PostRepository;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPublishedPosts() {
        return postRepository.findByPublishDateIsNotNull();
    }
}
