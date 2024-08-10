package com.orez.cost_calculator;

import com.orez.cost_calculator.Models.Model;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Model.getInstance().getViewFactory().showClientWindow();
//        GridPane root = new GridPane();
//
//        root.getColumnConstraints().addAll(DoubleStream.of(30, 2, 68)
//                .mapToObj(width -> {
//                    ColumnConstraints constraints = new ColumnConstraints();
//                    constraints.setPercentWidth(width);
//                    constraints.setFillWidth(true);
//                    return constraints;
//                }).toArray(ColumnConstraints[]::new));
//
//        RowConstraints rowConstraints = new RowConstraints();
//        rowConstraints.setVgrow(Priority.ALWAYS);
//
//        root.getRowConstraints().add(rowConstraints);
//
////        root.addRow(0, Stream.of("red", "green", "blue").map(s -> {
////            Region region = new Region();
////            region.setStyle("-fx-background-color:"+s);
////            return region;
////        }).toArray(Node[]::new));
//
//        Scene scene = new Scene(root);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
}


