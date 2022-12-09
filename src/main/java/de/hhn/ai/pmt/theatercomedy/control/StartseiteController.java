package de.hhn.ai.pmt.theatercomedy.control;

import de.hhn.ai.pmt.theatercomedy.view.RegistrierenView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;

public class StartseiteController {

    @FXML
    private Button favoriteButton;
    @FXML
    protected void onFavoritenButtonClick() {
        System.out.println("----- Favoriten Button geklickt -----");

        RegistrierenView view = new RegistrierenView();
        view.startView(favoriteButton);
    }


    // for registration
    @FXML
    private Label welcomeText;

    @FXML
    protected void onRegistrationButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
