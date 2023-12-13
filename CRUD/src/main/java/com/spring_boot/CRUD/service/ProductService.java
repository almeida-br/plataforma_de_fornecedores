package com.spring_boot.CRUD.service;

import com.spring_boot.CRUD.model.Product;
import com.spring_boot.CRUD.record.RequestProduct;
import com.spring_boot.CRUD.repository.ProductRepository;

public class ProductRegisterService {
    ProductRepository repo;

    public void registrarProduto(RequestProduct requestProduct) {
        Product produto=new Product(requestProduct);
        repo.save(produto);
    }


}
