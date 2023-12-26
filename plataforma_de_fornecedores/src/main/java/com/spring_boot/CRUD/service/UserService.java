package com.spring_boot.CRUD.service;

import com.spring_boot.CRUD.model.user.User;
import com.spring_boot.CRUD.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    UserRepository repository;

    public void registerUser(User user) {
            repository.save(user);
    }

    public User findUser(Long id){
        User user=repository.findById(id).get();
        return user;
    }

    public boolean userExists(Long id){
        return repository.existsById(id);
    }
}
