package com.spring_boot.plataforma_de_fornecedores.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.spring_boot.plataforma_de_fornecedores.repository.ProductRepository;

public class ProductService {
    @Autowired
    ProductRepository repo;

    public void registerProduct(/*RequestProduct requestProduct*/) {
       /* Product produto=new Product();
        repo.save(produto);*/
    }


}
