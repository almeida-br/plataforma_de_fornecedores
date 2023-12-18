package com.spring_boot.CRUD.controller.product;

import com.spring_boot.CRUD.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController{

    ProductService service;

    @PostMapping
    public boolean postProduct(){
        service.registrarProduto();
        return true;
    }
}
