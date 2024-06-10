package org.pass.passwordmanager.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.pass.passwordmanager.App;

public class LoginController {

    @FXML
    public Label label1;

    @FXML
    public Button ButtonLogInPage;


    public void handlePressingButtonLogInPage(ActionEvent actionEvent) {

        label1.setText("You Pressed button");
        ButtonLogInPage.setText("Pressed button");

    }
}
