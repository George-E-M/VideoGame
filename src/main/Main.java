package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import fxmlControllers.StartMenuController;
import fxmlControllers.tools.UIManager;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        UIManager.setPrimaryStage(primaryStage);
        UIManager.setControllerClass(StartMenuController.class);

        Parent root = FXMLLoader.load(getClass().getResource("../fxmlControllers/fxmlFiles/startMenu.fxml"));
        primaryStage.setTitle("Game :)");
        primaryStage.setScene(new Scene(root, 800, 550));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
