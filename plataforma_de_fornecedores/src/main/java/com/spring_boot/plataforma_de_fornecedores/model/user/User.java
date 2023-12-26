package com.spring_boot.plataforma_de_fornecedores.model.user;

import com.spring_boot.plataforma_de_fornecedores.model.product.Product;
import com.spring_boot.plataforma_de_fornecedores.model.user.dto.UserUpdateRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Table(name = "user")
@Entity(name = "user")
@Component
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Category category;
    @Embedded
    private Contact contact;
    @OneToMany(mappedBy = "fornecedor")
    private List<Product> productList;
    private LocalDate signUpDate;
    private int productQuant;
    private int supplierQuant;

    public User(){

    }
    public User(String name,String description,Category category,Contact contact) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.contact = contact;
        this.productList = null;
        this.signUpDate = LocalDate.now();
        this.productQuant=this.supplierQuant=0;
    }

    public User(User user) {
    }

    public void updateData(UserUpdateRequestDTO userUpdate){
        this.id=userUpdate.getId();
        this.name=userUpdate.getName();
        this.description= userUpdate.getDescription();
        this.category=userUpdate.getCategory();
        this.contact=userUpdate.getContact();
        this.productList=userUpdate.getProductList();
        this.productQuant=userUpdate.getProductQuant();
        this.supplierQuant= userUpdate.getSupplierQuant();
    }
}
