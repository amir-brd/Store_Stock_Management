package com.example.store_stock.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Bill_Details")
@Getter
@Setter
@RequiredArgsConstructor
public class BillDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBillDetails;

    private int quantity;
    private float totalPrice;
    private int discountPercentage;
    private float amountDiscount;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Bill bill;

}
