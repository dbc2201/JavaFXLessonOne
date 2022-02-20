package io.github.dbc.javafxlessonone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),
                // These Screen.getPrimary().getBounds().getMin methods will give you minimum width and height
                Screen.getPrimary().getBounds().getMinX(),
                Screen.getPrimary().getBounds().getMinY());
        stage.setTitle("JavaFX Lesson One");
        stage.setScene(scene);
        stage.show();
    }
}