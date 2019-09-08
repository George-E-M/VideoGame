package fxmlControllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import fxmlControllers.tools.UIManager;

public class StartMenuController {

    /**
     * Invoked when the user presses the new game button. Swaps to the start game scene.
     */
    @FXML
    private void startNewGame() {
        UIManager.changeScenes("fxmlFiles/characterCreation.fxml");
    }

    /**
     * Invoked when the user presses the load game button. Swaps to the load game scene.
     */
    @FXML
    private void loadGame() {
        UIManager.changeScenes("fxmlFiles/loadGame.fxml");
    }

    /**
     * Invoked when the user presses the settings button. Swaps to the settings scene.
     */
    @FXML
    private void changeSettings() {
        UIManager.changeScenes("fxmlFiles/settings.fxml");
    }

    /**
     * Invoked when the user presses the quit button
     */
    @FXML
    private void quit() {
        Platform.exit();
        System.exit(0);
    }
}
