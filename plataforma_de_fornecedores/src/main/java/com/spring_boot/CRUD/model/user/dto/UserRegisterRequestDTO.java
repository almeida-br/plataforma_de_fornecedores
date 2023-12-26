package com.spring_boot.CRUD.model.user.dto;

import com.spring_boot.CRUD.model.user.Category;
import com.spring_boot.CRUD.model.user.Contact;
import com.spring_boot.CRUD.model.user.User;

public class UserRegisterRequestDTO {
    private String nome;
    private String desricao;
    private Category categoria;
    private Contact contato;

    public UserRegisterRequestDTO(String nome, String desricao, Category categoria, Contact contato) {
        this.nome = nome;
        this.desricao = desricao;
        this.categoria = categoria;
        this.contato = contato;
    }
    public User transformDtoToUser(){
        return new User(nome,desricao,categoria,contato);
    }
}
