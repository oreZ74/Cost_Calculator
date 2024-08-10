package com.orez.cost_calculator.Views;

import com.orez.cost_calculator.Controllers.Client.DashboardController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.controlsfx.control.spreadsheet.Grid;

public class ViewFactory {
    private GridPane dashboardView;


    public ViewFactory() {
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml"));
        DashboardController dashboardController = new DashboardController();
        loader.setController(dashboardController);
        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Cost Calculator");
        stage.setResizable(true);
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}

