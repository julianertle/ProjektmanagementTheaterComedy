package de.hhn.ai.pmt.theatercomedy.view;

import de.hhn.ai.pmt.theatercomedy.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import java.io.IOException;
import java.net.URL;


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

        ClassLoader classLoader = getClass().getClassLoader();
        URL fxmlUrl = classLoader.getResource("de/hhn/ai/pmt/theatercomedy/startseite-view.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(fxmlUrl);

        Scene scene = new Scene(fxmlLoader.load(), screenWidth / 3.0, screenHeight / 2.0);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMinWidth(screenWidth / 3.0);
        stage.setMinHeight(screenHeight / 2.0);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}