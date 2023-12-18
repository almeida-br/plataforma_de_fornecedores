package com.spring_boot.CRUD.service;

import com.spring_boot.CRUD.model.user.User;
import com.spring_boot.CRUD.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    UserRepository repository;

    public void registrarUsuario() {
            //repository.save();
    }

    public Optional<User> buscarUsuario(Long id){
        return repository.findById(id);
    }

}
