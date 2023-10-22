package com.socialmedia.repo;
import com.socialmedia.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepo extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
    Users findByEmail(String email);
}
