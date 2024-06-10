package org.pass.passwordmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("New Scene");
        //Create view from FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        //Set view in window
        primaryStage.setScene(new Scene(loader.load()));
        //Launch
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
