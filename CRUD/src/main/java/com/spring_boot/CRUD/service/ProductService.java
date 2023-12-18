package com.spring_boot.CRUD.service;

import com.spring_boot.CRUD.model.product.RequestProduct;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring_boot.CRUD.model.product.Product;
import com.spring_boot.CRUD.repository.ProductRepository;

public class ProductService {
    @Autowired
    ProductRepository repo;

    public void registrarProduto(/*RequestProduct requestProduct*/) {
       /* Product produto=new Product();
        repo.save(produto);*/
    }


}
