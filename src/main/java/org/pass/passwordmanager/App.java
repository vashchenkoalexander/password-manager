package org.pass.passwordmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.pass.passwordmanager.Controllers.Util.CustomTitleBarController;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.initStyle(StageStyle.UNDECORATED);

        // Load the custom title bar
        FXMLLoader titleBarLoader = new FXMLLoader(getClass().getResource("/Fxml/util/CustomTitleBar.fxml"));
        Parent titleBar = titleBarLoader.load();
        CustomTitleBarController titleBarController = titleBarLoader.getController();
        titleBarController.setStage(primaryStage);

        //Main content
        primaryStage.setTitle("Password Manager");
        FXMLLoader Loginloader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Parent login = Loginloader.load();

        // Combine title bar and main content
        VBox root = new VBox(titleBar, login);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
