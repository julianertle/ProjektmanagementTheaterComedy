package de.hhn.ai.pmt.theatercomedy.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.net.URL;

public class RegistrierenView {

    public void startView(Button favoriteButton){
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            URL fxmlUrl = classLoader.getResource("de/hhn/ai/pmt/theatercomedy/registrieren-view.fxml");
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
