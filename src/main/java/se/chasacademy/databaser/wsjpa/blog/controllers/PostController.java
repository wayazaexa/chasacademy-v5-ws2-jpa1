package se.chasacademy.databaser.wsjpa.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.chasacademy.databaser.wsjpa.blog.models.Post;
import se.chasacademy.databaser.wsjpa.blog.services.PostService;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts/published")
    public List<Post> getPublishedPosts() {
        return postService.getPublishedPosts();
    }
}