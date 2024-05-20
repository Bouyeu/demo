package com.example.demo.controllers;

import com.example.demo.model.Commande;
import com.example.demo.model.CommandeProduit;
import com.example.demo.model.Produit;
import com.example.demo.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class UserController {

    @FXML
    private Button connexionBTN;

    @FXML
    private TextField loginTFD;

    @FXML
    private PasswordField passwordPWF;

    @FXML
    void loginRequet(ActionEvent event) {

       /*Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("cours javaFX");
        a.setHeaderText("Gestion scolarite");
        a.setContentText("Authentification");
        a.showAndWait();*/
        Session session = HibernateUtil.getSession();

        try {
            Commande commande = new Commande();
            commande.setDate(new Date());
            commande.setAdresseLivraison("DAKAR");
            Produit produit = new Produit();
            produit.setLibelle("MAgi");
            produit.setPrix(100);

            session.save(produit);

            CommandeProduit commandeProduit = new CommandeProduit();

        } catch (HibernateException e) {

            throw new RuntimeException(e);
        }finally {
            session.close();
        }


    }

}
