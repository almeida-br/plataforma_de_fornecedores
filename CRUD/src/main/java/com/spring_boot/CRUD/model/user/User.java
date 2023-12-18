package com.spring_boot.CRUD.model.user;

import com.spring_boot.CRUD.model.user.dto.RequestUser;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Table(name = "user")
@Entity(name = "user")
@Component
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String senha;
    private LocalDate dataDeAcesso;
    private LocalDate dataDeSaida;

    public User(RequestUser request) {
        this.id=request.id();
        this.nome=request.nome();
        this.senha=request.senha();
        this.dataDeAcesso=null;
        this.dataDeSaida=null;
    }
}
