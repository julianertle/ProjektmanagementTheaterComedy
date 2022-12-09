package de.hhn.ai.pmt.theatercomedy.control;

import de.hhn.ai.pmt.theatercomedy.view.RegistrierenView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    public Button homeButton;
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
