package pl.moja.biblioteczka.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainController {

    @FXML
    BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController;

    private void initialize(){
        topMenuButtonsController.setMainController(this);

    }

}
