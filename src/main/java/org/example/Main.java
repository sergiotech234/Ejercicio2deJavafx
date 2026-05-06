package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Haz Click aqui");
        button1.setOnAction(e -> {
            System.out.println("Has pulsado");
        });
        Scene scene = new Scene(button1, 300, 200);
        primaryStage.setTitle("Aplicacion  de clic de boton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
