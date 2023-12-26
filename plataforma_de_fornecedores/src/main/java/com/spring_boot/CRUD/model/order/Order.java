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
    private LocalDate orderDate;
    private boolean isFinished;
    private LocalDate dateOfConclusion;
    private List<OrderItem> items=new ArrayList<OrderItem>();

}
