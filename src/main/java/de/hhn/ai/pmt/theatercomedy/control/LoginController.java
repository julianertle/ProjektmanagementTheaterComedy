package de.hhn.ai.pmt.theatercomedy.control;


import de.hhn.ai.pmt.theatercomedy.view.RegistrierenView;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import klassendiagramm.*;
import java.io.IOException;
import java.nio.channels.ConnectionPendingException;


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
    void loginButtonOnClick() throws IOException, RuntimeException {

        String user = usernameTextField.getCharacters().toString();
        String passwort = passwordTextField.getCharacters().toString();

        if(user.isEmpty()||user.isBlank()){
            emptyUsernameDialog();
            System.out.println("Benutzer darf nicht leer sein");
            return;
        }else if(passwort.isEmpty()||passwort.isBlank()){
            emptyPasswortDialog();
            System.out.println("Passwort darf nicht leer sein");
            return;
        }

        Benutzerkonto benutzerkonto = null;
        try{
            benutzerkonto = BenutzerkontoDAO.getBenutzerkontoByORMID(user);

        }catch (ConnectionPendingException e){
            connectionProblemDialog();
            System.out.println(e);
            return;
        }
        if(benutzerkonto==null){
            System.out.println("BenutzerName nicht vorhanden");
            noUserDialog();
            return;
        }


        if(!passwort.equals(benutzerkonto.getPasswort())){
            System.out.println("Falsches Passwort");
            wrongPasswortDialog();
        }else{
            System.out.println("Erfolgreich angemeldet");
            corrrectLoginDialog();
        }

    }

    @FXML
    void registerLinkOnClick() {
        System.out.println("----- Link geklickt -----");
        RegistrierenView view = new RegistrierenView();
        view.startView(registerLink.getScene());
    }

    public void connectionProblemDialog(){
        Dialog<String> noConnectionDialog = new Dialog<>();

        noConnectionDialog.setTitle("Verbindung verloren");
        noConnectionDialog.setContentText("Keine Verbindung mit dem Server möglich");
        ButtonType type = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
        noConnectionDialog.getDialogPane().getButtonTypes().add(type);
        noConnectionDialog.show();
    }
    public void noUserDialog(){
        Dialog<String> noUserDialog = new Dialog<>();

        noUserDialog.setTitle("User nicht vorhanden");
        noUserDialog.setContentText("Der eingegebene Benutzer existiert nicht");
        ButtonType type = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
        noUserDialog.getDialogPane().getButtonTypes().add(type);
        noUserDialog.show();
    }
    public void emptyUsernameDialog(){
        Dialog<String> noUsernameDialog = new Dialog<>();

        noUsernameDialog.setTitle("Username leer");
        noUsernameDialog.setContentText("Sie müssen einen Usernamen eingeben");
        ButtonType type = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
        noUsernameDialog.getDialogPane().getButtonTypes().add(type);
        noUsernameDialog.show();
    }
    public void emptyPasswortDialog(){
        Dialog<String> noPasswortDialog = new Dialog<>();

        noPasswortDialog.setTitle("Passwort leer");
        noPasswortDialog.setContentText("Sie müssen einen Passwort eingeben");
        ButtonType type = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
        noPasswortDialog.getDialogPane().getButtonTypes().add(type);
        noPasswortDialog.show();
    }
    public void wrongPasswortDialog(){
        Dialog<String> wrongPasswortDialog = new Dialog<>();

        wrongPasswortDialog.setTitle("Passwort falsch");
        wrongPasswortDialog.setContentText("Ihr eingegebenes Passwort ist falsch");
        ButtonType type = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
        wrongPasswortDialog.getDialogPane().getButtonTypes().add(type);
        wrongPasswortDialog.show();
    }
    public void corrrectLoginDialog(){
        Dialog<String> correctLoginDialog = new Dialog<>();

        correctLoginDialog.setTitle("Erfolgreich angemeldet");
        correctLoginDialog.setContentText("Glückwunsch!!! Sie haben sich erfolgreich angemeldet!");
        ButtonType type = new ButtonType("OK",ButtonBar.ButtonData.OK_DONE);
        correctLoginDialog.getDialogPane().getButtonTypes().add(type);
        correctLoginDialog.show();
    }

}

