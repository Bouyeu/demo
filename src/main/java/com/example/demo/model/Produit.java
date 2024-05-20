package com.example.demo.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 80)
    private String libelle;
    private int prix;
    @OneToMany(
            mappedBy = "produit"
            //cascade = CascadeType.ALL
            //orphanRemoval = true
    )
    private List<CommandeProduit> commandes;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
