package com.example.store_stock.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Ray")
@Getter
@Setter
@RequiredArgsConstructor

public class Ray implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRay;

    private String code;
    private String wording;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> products;
}
