package fxmlControllers;

import fxmlControllers.tools.UIManager;
import javafx.fxml.FXML;

public class LoadGameController {

    /**
     * Returns the user to the start menu scene. Invoked when the user presses the return button.
     */
    @FXML
    private void returnToStartMenu() {
        UIManager.changeScenes("fxmlFiles/startMenu.fxml");
    }

    /**
     * Loads the selected save and changes to the play screen. Invoked when the user presses the load game button.
     */
    @FXML
    private void loadGame() {
        // TODO implement loading games
    }
}
