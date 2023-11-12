package com.spring_boot.CRUD.model.entity;

import com.spring_boot.CRUD.model.record.RequestProduct;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@NoArgsConstructor
@AllArgsConstructor
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


    public Product(String descricao, Integer precoEmCentavos, LocalDate dataCadastro, Supplier fornecedor, Category categoria) {
        this.descricao=descricao;
        this.precoEmCentavos=precoEmCentavos;
        this.dataCadastro=dataCadastro;
        this.fornecedor=fornecedor;
        this.categoria=categoria;
    }
    public Product(RequestProduct requestProduct) {
        this.descricao=requestProduct.descricao();
        this.precoEmCentavos=requestProduct.precoEmCentavos();
        this.dataCadastro=requestProduct.dataCadastro();
        this.fornecedor=requestProduct.fornecedor();
        this.categoria=requestProduct.categoria();
    }
}
