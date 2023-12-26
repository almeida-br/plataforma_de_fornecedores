package com.spring_boot.plataforma_de_fornecedores.repository;

import com.spring_boot.plataforma_de_fornecedores.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Override
    Product save(Product entity);

    @Override
    Optional<Product> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Product entity);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    void deleteAll(Iterable<? extends Product> entities);

    @Override
    void deleteAll();
}
