package com.socialmedia.model;

import jakarta.persistence.*;


@Entity
@Table(name = "follower")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "follower_id")
    private Users follower_id;

    @ManyToOne
    @JoinColumn(name = "followed_id")
    private Users followed_id;

    // Constructors, getters, and setters
}