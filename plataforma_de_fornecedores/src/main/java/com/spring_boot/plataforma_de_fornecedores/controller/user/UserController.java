package com.spring_boot.plataforma_de_fornecedores.controller.user;


import com.spring_boot.plataforma_de_fornecedores.model.user.User;
import com.spring_boot.plataforma_de_fornecedores.model.user.dto.UserRegisterRequestDTO;
import com.spring_boot.plataforma_de_fornecedores.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService service;

    @PostMapping
    public void postUser(@RequestBody @Valid UserRegisterRequestDTO userDTO) {
        User user=userDTO.transformDtoToUser();
        service.registerUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@RequestParam long id){
        User user=null;
        if(service.userExists(id)) {
            user=service.findUser(id);
        }
        return user;
    }
}
