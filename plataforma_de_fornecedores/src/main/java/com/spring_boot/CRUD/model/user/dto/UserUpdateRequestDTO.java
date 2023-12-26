package com.spring_boot.CRUD.model.user.dto;

import com.spring_boot.CRUD.model.product.Product;
import com.spring_boot.CRUD.model.user.Category;
import com.spring_boot.CRUD.model.user.Contact;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

public class UserUpdateRequestDTO {
    private long id;
    private String name;
    private String description;
    private Category category;
    @Embedded
    private Contact contact;
    @OneToMany(mappedBy = "fornecedor")
    private List<Product> productList;
    private int productQuant;
    private int supplierQuant;

    public UserUpdateRequestDTO(long id, String name, String description, Category category, Contact contact, List<Product> productList, int productQuant, int supplierQuant) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.contact = contact;
        this.productList = productList;
        this.productQuant = productQuant;
        this.supplierQuant = supplierQuant;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public Contact getContact() {
        return contact;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getProductQuant() {
        return productQuant;
    }

    public int getSupplierQuant() {
        return supplierQuant;
    }
}
