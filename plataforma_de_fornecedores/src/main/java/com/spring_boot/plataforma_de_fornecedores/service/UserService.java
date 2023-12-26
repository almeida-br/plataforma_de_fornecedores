package com.spring_boot.plataforma_de_fornecedores.service;

import com.spring_boot.plataforma_de_fornecedores.model.user.User;
import com.spring_boot.plataforma_de_fornecedores.repository.UserRepository;
import org.springframework.stereotype.Service;

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
