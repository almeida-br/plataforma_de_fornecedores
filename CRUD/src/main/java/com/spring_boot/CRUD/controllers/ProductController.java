package com.spring_boot.CRUD.controllers;

import com.spring_boot.CRUD.model.entity.Product;
import com.spring_boot.CRUD.model.record.RequestProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController{

    @PostMapping
    public void postProduct(RequestProduct requestProduct){

    }
}
