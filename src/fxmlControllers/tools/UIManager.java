package fxmlControllers.tools;

import fxmlControllers.GameplayOpenMapController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class UIManager {
    private static Stage primaryStage;
    private static Class controllerClass;

    private UIManager() {
    }

    /**
     * This method sets the primary stage. This is used in main.
     */
    public static void setPrimaryStage(Stage primaryStage) {
        UIManager.primaryStage = primaryStage;
    }

    /**
     * This method sets the controller class to allow easy access to fxml files
     */
    public static void setControllerClass(Class controllerClass) {
        UIManager.controllerClass = controllerClass;
    }

    /**
     * This method handles changing scenes. It is given an input of an fxml file and changes to
     * the corresponding screen.
     */
    public static void changeScenes(String fxmlFile) {
        try {
            Parent sceneParent = FXMLLoader.load(controllerClass.getResource(fxmlFile));
            primaryStage.setScene(new Scene(sceneParent));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method handles changing to a Map scene. It is given an input of an fxml file and changes to
     * the corresponding screen. Additionally it handles initialising key presses.
     */
    public static void goToMapScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(controllerClass.getResource(fxmlFile));
            Parent sceneParent = loader.load();
            Scene scene = new Scene( sceneParent );
            GameplayOpenMapController controller = loader.getController();
            controller.initializeKeyEvents(scene);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method handles changing scenes when a pop up screen is needed. It is given an input of an fxml file
     * and changes to the correspoding scene.
     */
    public static void changeScenes(String fxmlFile, Stage stage) {
        try {
            Parent sceneParent = FXMLLoader.load(controllerClass.getResource(fxmlFile));
            stage.setScene(new Scene(sceneParent));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method opens a pop up stage.
     */
    public static void openStage(String fxmlFile) {
        try {
            Parent sceneParent = FXMLLoader.load(controllerClass.getResource(fxmlFile));
            Stage newStage = new Stage();
            Scene scene = new Scene(sceneParent);
            newStage.setScene(scene);

            //Disable the background window when the rate stage is displayed.
            newStage.initModality(Modality.WINDOW_MODAL);
            newStage.initOwner(primaryStage);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}