package org.pass.passwordmanager.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.pass.passwordmanager.Controllers.Client.ClientController;
import org.pass.passwordmanager.Controllers.Util.CustomTitleBarController;

import java.io.IOException;

public class LoginController {

    @FXML
    public Label label1;

    @FXML
    public Button ButtonLogInPage;
    @FXML
    public PasswordField passwordField;
    @FXML
    public TextField logInField;


    public void handlePressingButtonLogInPage(ActionEvent actionEvent) {

        if (actionEvent.getSource() == ButtonLogInPage && passwordField.getText() != null && logInField.getText() != null) {

            if (passwordField.getText().equals("pwd")) {
                try {

                            // Load the custom title bar
                            FXMLLoader titleBarLoader = new FXMLLoader(getClass().getResource("/Fxml/util/CustomTitleBar.fxml"));
                            Parent titleBar = titleBarLoader.load();
                            CustomTitleBarController titleBarController = titleBarLoader.getController();
                            titleBarController.setStage((Stage) ((Node) actionEvent.getSource()).getScene().getWindow());

                            //Main content
                            //primaryStage.setTitle("Password Manager");
                            FXMLLoader clientLoader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
                            Parent client = clientLoader.load();
                            ClientController clientController = clientLoader.getController();
                            clientController.setWelcomeUserLabel(logInField.getText());

                            // Combine title bar and main content
                            VBox root = new VBox(titleBar, client);
                            Scene scene = new Scene(root);

                            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                            stage.setScene(scene);
                            stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        
        label1.setText("Password wrong");

    }

    public void enterKeyPressed(KeyEvent keyEvent) {

        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            ActionEvent actionEvent = new ActionEvent(ButtonLogInPage, ButtonLogInPage);
            handlePressingButtonLogInPage(actionEvent);
        }

    }
}
