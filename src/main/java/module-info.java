module org.example.cost_calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires static lombok;
    requires org.controlsfx.controls;


    opens com.orez.cost_calculator to javafx.fxml;
    exports com.orez.cost_calculator;
    exports com.orez.cost_calculator.Controllers;
    exports com.orez.cost_calculator.Controllers.Client;
    exports com.orez.cost_calculator.Controllers.Client.Table;
    exports com.orez.cost_calculator.Models;
    exports com.orez.cost_calculator.Models.Table;
    exports com.orez.cost_calculator.Views;



}