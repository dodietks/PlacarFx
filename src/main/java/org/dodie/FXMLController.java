package org.dodie;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXMLController {
    @FXML
    private Button buttonSair;
    @FXML
    public static Button buttonMaximizar;

    public void initialize() {
    }

    @FXML
    private void setButtonSair() {
        Platform.exit();
    }
    @FXML
    public void setButtonMaximizar() throws Exception{
        //TODO = implementar motão fullscreen
    }
}
