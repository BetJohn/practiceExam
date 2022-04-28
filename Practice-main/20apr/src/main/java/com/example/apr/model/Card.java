package com.example.apr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Card {
    @Id
    @GeneratedValue
    private Long id;

    private String number;
    private String CVV;
    private Client owner;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Client client;

}
