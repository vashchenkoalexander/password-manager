package org.pass.passwordmanager.Controllers.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.pass.passwordmanager.Controllers.Util.CustomTitleBarController;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {

    @FXML
    public Label welcomeUserLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //welcomeUserLabel.setText(welcomeUserLabel.getText() + " username here");
    }

    public void setWelcomeUserLabel (String data) {
        welcomeUserLabel.setText(welcomeUserLabel.getText() + " " + data);
    }

}
