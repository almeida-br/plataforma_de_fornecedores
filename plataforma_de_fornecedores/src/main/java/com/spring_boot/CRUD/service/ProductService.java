package com.spring_boot.CRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.spring_boot.CRUD.repository.ProductRepository;

public class ProductService {
    @Autowired
    ProductRepository repo;

    public void registerProduct(/*RequestProduct requestProduct*/) {
       /* Product produto=new Product();
        repo.save(produto);*/
    }


}
