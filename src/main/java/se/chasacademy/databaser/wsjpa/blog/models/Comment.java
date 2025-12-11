package se.chasacademy.databaser.wsjpa.blog.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String author;

    @Column
    private String text;

    @Column
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "post_id") // FK till Post
    private Post post;

    // Getters och setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public LocalDateTime getCreateDate() { return createDate; }
    public void setCreateDate(LocalDateTime createDate) { this.createDate = createDate; }

    public Post getPost() { return post; }
    public void setPost(Post post) { this.post = post; }
}