package se.chasacademy.databaser.wsjpa.blog.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @Column
    private String title, posttext, author;
    @Column
    private LocalDateTime publishDate, createDate;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosttext() {
        return posttext;
    }

    public void setPosttext(String posttext) {
        this.posttext = posttext;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    // Relation: En Post kan ha flera kommentarer
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

    // Getter & Setter för kommentarer
    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }

}
