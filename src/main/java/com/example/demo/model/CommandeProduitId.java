package com.example.demo.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CommandeProduitId implements Serializable {
    private int commandeId;

   private int produitId;

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }
}
