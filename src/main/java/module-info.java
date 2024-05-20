module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.naming;
    requires java.persistence;
    requires java.sql;

    requires org.hibernate.orm.core;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;

    opens com.example.demo.controllers to javafx.fxml;
    exports com.example.demo.controllers;
    opens com.example.demo.model to org.hibernate.orm.core;
    exports com.example.demo.model;

}