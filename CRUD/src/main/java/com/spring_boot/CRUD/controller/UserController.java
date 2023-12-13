package com.spring_boot.CRUD.controllers;


import com.spring_boot.CRUD.record.RequestUser;
import com.spring_boot.CRUD.service.UserRegisterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    UserRegisterService service;

    @PostMapping
    public boolean postUser(RequestUser request) {
        service.registrarUsuario(request);
        return true;
    }
}
