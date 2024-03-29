package com.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String email;
        private String name;
        private String password;
        private String username;

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "user_roles",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
        private Set<Role> roles = new HashSet<>();

        // Constructors, getters, setters, and other methods
    }


