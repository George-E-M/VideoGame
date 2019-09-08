package fxmlControllers;

import fxmlControllers.tools.UIManager;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CharacterCreationController {
    @FXML
    private TextField nameField;

    @FXML
    private void selectFighter() {

    }

    @FXML
    private void selectRogue() {

    }

    @FXML
    private void selectMage() {

    }

    @FXML
    private void returnToStart() {
        UIManager.changeScenes("fxmlFiles/startMenu.fxml");
    }

    @FXML
    private void continueToStats() {
        UIManager.changeScenes("fxmlFiles/statSelection.fxml");
    }
}
