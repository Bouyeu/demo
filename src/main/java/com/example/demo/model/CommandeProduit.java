package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class CommandeProduit {
    @EmbeddedId
    private CommandeProduitId commandeProduitId;
    @ManyToOne
    @MapsId("commandeId")
    private  Commande commande;
    @ManyToOne
    @MapsId("produitId")
    private Produit produit;

    private float quantite;

    public CommandeProduitId getCommandeProduitId() {
        return commandeProduitId;
    }

    public void setCommandeProduitId(CommandeProduitId commandeProduitId) {
        this.commandeProduitId = commandeProduitId;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }
}
