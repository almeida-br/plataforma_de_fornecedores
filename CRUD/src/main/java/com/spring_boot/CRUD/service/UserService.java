package com.spring_boot.CRUD.service;

import com.spring_boot.CRUD.model.User;
import com.spring_boot.CRUD.record.RequestUser;
import com.spring_boot.CRUD.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRegisterService {

    UserRepository repository;

    public void registrarUsuario(User user) {
            repository.save(user);
    }

    public Optional<User> buscarUsuario(Long id){
        return repository.findById(id);
    }

}
