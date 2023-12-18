package com.spring_boot.CRUD.controller.user;


import com.spring_boot.CRUD.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService service;

    @PostMapping
    public boolean postUser() {
        service.registrarUsuario();
        return true;
    }
}
