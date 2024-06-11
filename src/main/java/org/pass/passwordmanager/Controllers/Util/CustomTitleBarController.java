package org.pass.passwordmanager.Controllers.Util;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CustomTitleBarController {

    public Label appTitle;
    private Stage stage;

    @FXML
    private Button closeButton;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void close() {
        Platform.exit();
    }

    @FXML
    private void minimize() {
        stage.setIconified(true);
    }

    @FXML
    private void maximize() {
        stage.setMaximized(!stage.isMaximized());
    }

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private void onDragPressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    @FXML
    private void onDragDragged(MouseEvent event) {
        stage.setX(event.getScreenX() - xOffset);
        stage.setY(event.getScreenY() - yOffset);
    }
}