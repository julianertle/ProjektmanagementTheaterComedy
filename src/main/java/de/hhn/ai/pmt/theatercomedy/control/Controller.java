package de.hhn.ai.pmt.theatercomedy.control;

import de.hhn.ai.pmt.theatercomedy.view.EinstellungenView;
import de.hhn.ai.pmt.theatercomedy.view.LoginView;
import de.hhn.ai.pmt.theatercomedy.view.RegistrierenView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class Controller {


    @FXML
    public Button homeButton;
    public MenuItem loginMenuButton;
    public MenuItem registrationMenuButton;
    public MenuItem settingsMenuButton;

    @FXML
    private Button favoriteButton;

    @FXML
    protected void onFavoritenButtonClick() {
        System.out.println("----- Favoriten Button geklickt -----");
    }

    @FXML
    protected void onSettingsMenuClick() {
        System.out.println("----- Einstellungen geklickt -----");
        EinstellungenView view = new EinstellungenView();
        view.startView(homeButton.getScene());
    }

    @FXML
    protected void onHomeButtonClick() {
        System.out.println("----- Home Button geklickt -----");

    }
    @FXML
    protected void onRegistrationMenuClick() {
        System.out.println("----- Registrierung geklickt -----");
        RegistrierenView view = new RegistrierenView();
        view.startView(homeButton.getScene());
    }
    @FXML
    protected void onLoginMenuClick() {
        System.out.println("----- Login geklickt -----");
        LoginView view = new LoginView();
        view.startView(homeButton.getScene());
    }

    // for registration
    @FXML
    private Label welcomeText;

    @FXML
    protected void inRegistrationViewButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }
}
