package com.spring_boot.CRUD.controllers;

import com.spring_boot.CRUD.record.RequestProduct;
import com.spring_boot.CRUD.service.ProductRegisterService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController{

    ProductRegisterService service;

    @PostMapping
    public boolean postProduct(RequestProduct requestProduct){
        service.registrarProduto(requestProduct);
        return true;
    }
}
