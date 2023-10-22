package com.socialmedia.service;


import com.socialmedia.model.Users;
import com.socialmedia.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepo usersRepository;

    @Autowired
    public UsersService(UsersRepo userRepository) {
        this.usersRepository = userRepository;
    }

    public Users findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

    public Users findByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }
}

