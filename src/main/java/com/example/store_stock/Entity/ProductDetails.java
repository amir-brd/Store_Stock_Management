package com.example.store_stock.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Product_Details")
@Getter
@Setter
@RequiredArgsConstructor

public class ProductDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProductDetails;

    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @Temporal(TemporalType.DATE)
    private Date lastUpdateDate;

    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;

    @OneToOne
    private Product product;
}
