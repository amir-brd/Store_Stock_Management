package com.example.store_stock.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Products")
@Getter
@Setter
@RequiredArgsConstructor

public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    private String code;
    private String wording;
    private float unitPrice;

    @OneToOne
    private ProductDetails productDetails;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Supplier> suppliers;

    @ManyToOne
    private Ray ray;

    @ManyToOne
    private Stock stock;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<BillDetails> billDetails;
}
