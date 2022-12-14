package de.hhn.ai.pmt.theatercomedy.control;



import de.hhn.ai.pmt.theatercomedy.view.RegistrierenView;
import de.hhn.ai.pmt.theatercomedy.view.StartseiteView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Label passwordLabel;

    @FXML
    private Hyperlink registerLink;

    @FXML
    void loginButtonOnClick() throws IOException {
        System.out.println("----- Login Button geklickt -----");
        StartseiteView view = new StartseiteView();
        view.start(new Stage());

        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void registerLinkOnClick() {
        System.out.println("----- Link geklickt -----");
        RegistrierenView view = new RegistrierenView();
        view.startView(registerLink.getScene());
    }

}
