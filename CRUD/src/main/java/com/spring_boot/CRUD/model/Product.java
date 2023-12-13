package com.spring_boot.CRUD.model.entity;

import com.spring_boot.CRUD.record.RequestProduct;
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
    private Supplier fornecedor;
    private Category categoria;


    public Product(RequestProduct requestProduct) {
        this.id=requestProduct.id();
        this.descricao=requestProduct.descricao();
        this.precoEmCentavos=requestProduct.precoEmCentavos();
        this.dataCadastro=requestProduct.dataCadastro();
        this.fornecedor=requestProduct.fornecedor();
        this.categoria=requestProduct.categoria();
    }
}
