package com.spring_boot.CRUD.model.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {

    private Long id;
    private LocalDate dataDoPedido;
    private boolean foiConcluido;
    private LocalDate dataDeConclusao;
    private List<OrderItem> itens=new ArrayList<OrderItem>();

}
