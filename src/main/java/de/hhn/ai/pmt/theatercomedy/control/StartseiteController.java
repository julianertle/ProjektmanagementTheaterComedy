package de.hhn.ai.pmt.theatercomedy.control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

public class StartseiteController {

    @FXML
    private Button favoriteButton;
    @FXML
    protected void onFavoritenButtonClick() {
        System.out.println("----- Favoriten Button geklickt -----");

            try {
                ClassLoader classLoader = getClass().getClassLoader();
                URL fxmlUrl = classLoader.getResource("de/hhn/ai/pmt/theatercomedy/hello-view.fxml");
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(fxmlUrl);
                Node root = fxmlLoader.load();

                // get the current scene and set its root to the new node
                Scene scene = favoriteButton.getScene();
                scene.setRoot((Parent) root);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
    }
}
