package com.example.store_stock.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Client")
@Getter
@Setter
@RequiredArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String firstName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private ClientCategory clientCategory;

    @Enumerated(EnumType.STRING)
    private Occupation occupation;

    @OneToMany
    private Set<Bill> bills;
}
