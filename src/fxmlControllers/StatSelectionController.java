package fxmlControllers;

import fxmlControllers.tools.UIManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StatSelectionController {

    @FXML
    private Label strengthLabel;

    @FXML
    private Label constitutionLabel;

    @FXML
    private Label dexterityLabel;

    @FXML
    private Label intelligenceLabel;

    @FXML
    private Label wisdomLabel;

    @FXML
    private Label charismaLabel;

    @FXML
    private void startGame() {
        UIManager.goToMapScene("fxmlFiles/gameplayOpenMap.fxml");
    }

    @FXML
    private void backToCharacterCreation() {
        UIManager.changeScenes("fxmlFiles/characterCreation.fxml");
    }
}
