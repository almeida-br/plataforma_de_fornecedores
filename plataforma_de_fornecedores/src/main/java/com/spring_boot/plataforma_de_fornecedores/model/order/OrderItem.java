package com.spring_boot.plataforma_de_fornecedores.model.order;

import com.spring_boot.plataforma_de_fornecedores.model.product.Product;
import com.spring_boot.plataforma_de_fornecedores.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderItem {

    private Product product;
    private User supplier;
    private int priceInCents;
    private int quantity;
}
