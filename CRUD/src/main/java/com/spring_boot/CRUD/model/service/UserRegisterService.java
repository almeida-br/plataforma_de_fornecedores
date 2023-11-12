package com.spring_boot.CRUD.model.service;

import com.spring_boot.CRUD.controllers.UserController;
import com.spring_boot.CRUD.model.record.RequestUser;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {
    public static void registrarUsuario(String nome, String cpf) {
            RequestUser request=new RequestUser(nome,cpf);
            if(new UserController().postUser(request).hasBody()){
                System.out.println("Usuário cadastrado com sucesso");
            }else {
                System.out.println("Usuário não pode ser cadastrado");
            }
    }

}
