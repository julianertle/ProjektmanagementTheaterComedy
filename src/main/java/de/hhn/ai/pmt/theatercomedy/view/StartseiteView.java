package de.hhn.ai.pmt.theatercomedy.view;

import de.hhn.ai.pmt.theatercomedy.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import java.io.IOException;


public class StartseiteView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Get the default GraphicsEnvironment object
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Get the screen size as a Rectangle object
        Rectangle screenSize = ge.getMaximumWindowBounds();

        // Get the screen height and width
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startseite-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), screenWidth / 3.0, screenHeight / 2.0);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}