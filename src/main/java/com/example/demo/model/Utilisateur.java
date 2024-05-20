package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 80)
    private String nom;
    @Column(length = 80)
    private String prenom;
    @Column(length = 80)
    private String email;
    @Column(length = 80)
    private String password;

}
