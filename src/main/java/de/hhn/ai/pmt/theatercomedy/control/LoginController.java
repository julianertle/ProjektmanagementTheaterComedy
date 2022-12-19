package de.hhn.ai.pmt.theatercomedy.control;


import de.hhn.ai.pmt.theatercomedy.view.RegistrierenView;
import de.hhn.ai.pmt.theatercomedy.view.StartseiteView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import klassendiagramm.*;
import org.orm.PersistentException;

import java.io.IOException;
import java.util.Objects;

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
    void loginButtonOnClick() throws IOException, PersistentException {

        usernameTextField.setText("Theater");
        passwordTextField.setText("Comedy");


        String user = usernameTextField.getCharacters().toString();
        String passwort = passwordTextField.getCharacters().toString();

        if(user.isEmpty()||user.isBlank()){
            System.out.println("Benutzer darf nicht leer sein");
            return;
        }else if(passwort.isEmpty()||passwort.isBlank()){
            System.out.println("Passwort darf nicht leer sein");
            return;
        }

        Benutzerkonto[] databaseUser = BenutzerkontoDAO.listBenutzerkontoByQuery("Benutzername like '" + user + "'", "Benutzername");
        Benutzerkonto benutzerkonto = null;
        try{
            //Benutzerkonto[] databaseUser = BenutzerkontoDAO.listBenutzerkontoByQuery("Benutzername like '" + user + "'", "Benutzername");
            Ticketshop ticketshop = TicketshopDAO.getTicketshopByORMID(2);

            BenutzerkontoSetCollection benutzerCollection = ticketshop.benutzer;
            Benutzerkonto[] benutzerkontoList = benutzerCollection.toArray();


            for(Benutzerkonto benutzerkontoListEach: benutzerkontoList){
                if(Objects.equals(benutzerkontoListEach.getBenutzername(), user)){
                    System.out.println(benutzerkontoListEach.getBenutzername());
                    benutzerkonto=benutzerkontoListEach;
                }else{
                    System.out.println("Nutzer nicht gefunden");
                    return;
                }
            }
        }catch (Exception e){
            System.out.println("BenutzerName nicht vorhanden");

        }

        try{
            if(!passwort.equals(benutzerkonto.getPasswort())){
                System.out.println("Falsches Passwort");
            }else{
                System.out.println("Erfolgreich angemeldet");
            }
        }catch (Exception e){
            System.out.println("fehler");
        }






        System.out.println("----- Login Button geklickt -----");


    }

    @FXML
    void registerLinkOnClick() {
        System.out.println("----- Link geklickt -----");
        RegistrierenView view = new RegistrierenView();
        view.startView(registerLink.getScene());
    }

}
