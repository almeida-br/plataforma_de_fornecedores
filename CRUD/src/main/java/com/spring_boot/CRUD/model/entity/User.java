package com.spring_boot.CRUD.model.entity;

import com.spring_boot.CRUD.model.record.RequestUser;
import jakarta.persistence.*;
import lombok.*;
import net.bytebuddy.asm.Advice;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Table(name = "user")
@Entity(name = "user")
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String senha;
    private LocalDate dataDeAcesso;
    private LocalDate dataDeSaida;
}
