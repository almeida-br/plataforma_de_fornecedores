package com.spring_boot.CRUD.model.product;

import com.spring_boot.CRUD.model.user.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Getter
@Setter
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private Integer precoEmCentavos;
    private LocalDate dataCadastro;
    private User fornecedor;
    private Category categoria;


    public Product() {
    }
}
