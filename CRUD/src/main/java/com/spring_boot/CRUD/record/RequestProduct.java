package com.spring_boot.CRUD.model.record;

import com.spring_boot.CRUD.model.entity.Category;
import com.spring_boot.CRUD.model.entity.Supplier;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

public record RequestProduct (
        Long id,
        String descricao,
        Integer precoEmCentavos,
        LocalDate dataCadastro,
        Supplier fornecedor,
        Category categoria
){
}
