package com.spring_boot.CRUD.model.product;

import com.spring_boot.CRUD.model.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Table(name="products")
@NoArgsConstructor
@Component
@Getter
@Setter
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Integer priceInCents;
    private LocalDate registerDate;
    private User supplier;
    private Category category;


}
