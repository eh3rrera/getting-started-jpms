package com.example.gui;

import com.example.quote.Quote;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import com.example.quote.Quote;

import java.util.ServiceLoader;

public class QuoteFxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Quotes");
        
        Label label = new Label("NO QUOTE");

        ServiceLoader.load(Quote.class)
                .forEach(service -> label.setText(service.getQuote()));

        Scene scene = new Scene(label, 500, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}