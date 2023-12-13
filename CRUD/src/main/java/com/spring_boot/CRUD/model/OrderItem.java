package com.spring_boot.CRUD.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderItem {

    private Product produto;
    private Supplier fornecedor;
    private int precoUnitarioEmCentavos;
    private int quantidade;
}
