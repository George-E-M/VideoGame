package fxmlControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameplayOpenMapController implements Initializable {

    private int playerPosition;

    private static final int mapSize = 2875;
    private static final int lineLength = 115;

    @FXML
    private TextArea map;

    @FXML
    private void moveUp() {
        String mapString = map.getText();
        char[] mapArray = mapString.toCharArray();
        System.out.println(playerPosition);
        if (playerPosition >= lineLength) {
            mapArray[playerPosition] = '#';
            playerPosition = playerPosition - lineLength;
            mapArray[playerPosition] = '@';
        }

        map.setText(new String(mapArray));
    }

    @FXML
    private void moveDown() {
        String mapString = map.getText();
        char[] mapArray = mapString.toCharArray();
        System.out.println(playerPosition);
        if (playerPosition <= mapSize - lineLength ) {
            mapArray[playerPosition] = '#';
            playerPosition = playerPosition + lineLength;
            mapArray[playerPosition] = '@';
        }

        map.setText(new String(mapArray));
    }

    @FXML
    private void moveLeft() {
        String mapString = map.getText();
        char[] mapArray = mapString.toCharArray();
        System.out.println(playerPosition);
        if ((playerPosition != 0 && playerPosition % lineLength != 0) || playerPosition == 1 ) {
            mapArray[playerPosition] = '#';
            playerPosition = playerPosition - 1;
            mapArray[playerPosition] = '@';
        }

        map.setText(new String(mapArray));
    }

    @FXML
    private void moveRight() {
        String mapString = map.getText();
        char[] mapArray = mapString.toCharArray();
        System.out.println(playerPosition);
        if (playerPosition == 0 || playerPosition % lineLength != 114 ) {
            mapArray[playerPosition] = '#';
            playerPosition = playerPosition + 1;
            mapArray[playerPosition] = '@';
        }

        map.setText(new String(mapArray));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        playerPosition = 0;
        initializeMap();
    }

    private void initializeMap() {
        map.setWrapText(true);
        map.setEditable(false);
        String mapString = "";
        try {
            // TODO fix this hardcoded value
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\Documents\\TestVideoGame\\src\\fxmlControllers\\map.txt"));
            String fileWord;
            while ((fileWord = reader.readLine()) != null) {
                mapString = mapString + fileWord;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.setText(mapString);
    }

    /**
     * TODO fix key events
     * @param scene
     */
    public void initializeKeyEvents(Scene scene) {
        System.out.println("initialized key events");
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.LEFT) {
                moveLeft();
            }
            if (e.getCode() == KeyCode.DOWN) {
                moveDown();
            }
            if (e.getCode() == KeyCode.RIGHT) {
                moveRight();
            }
            if (e.getCode() == KeyCode.UP) {
                moveUp();
            }
        });
    }
}
