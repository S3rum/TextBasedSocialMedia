package com.socialmedia.model;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "post")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @OneToMany(mappedBy = "post")
    private Set<Comment> comments;


    // Constructors, getters, and setters
}

