package com.example.store_stock.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Bill")
@Getter
@Setter
@RequiredArgsConstructor
public class Bill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBill;

    @Temporal(TemporalType.DATE)
    private Date billDate;

    private float billDiscount;
    private float billAmount;
    private boolean active;

    @OneToMany
    private Set<BillDetails> billDetails;

    @ManyToOne
    private Client client;

}
