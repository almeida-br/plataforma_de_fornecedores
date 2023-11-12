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
public class Supplier {
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String email;

}
