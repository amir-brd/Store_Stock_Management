package com.example.store_stock.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Stock")
@Getter
@Setter
@RequiredArgsConstructor
public class Stock  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;

    private int quantity;
    private int minimalQuantity;
    private String stockWording;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> products;

}
