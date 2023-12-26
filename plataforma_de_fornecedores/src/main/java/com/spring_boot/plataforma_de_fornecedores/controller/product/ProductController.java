package com.spring_boot.plataforma_de_fornecedores.controller.product;

import com.spring_boot.plataforma_de_fornecedores.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController{

    ProductService service;

    @PostMapping
    public boolean postProduct(){
        service.registerProduct();
        return true;
    }
}
