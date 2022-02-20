package io.github.dbc.javafxlessonone.controller;

import io.github.dbc.javafxlessonone.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    public Button modalityNoneButton;
    @FXML
    public Button applicationModalButton;
    @FXML
    public Button windowModalButton;
    @FXML
    public Button stageStyleDecoratedButton;
    @FXML
    public Button stageStyleUndecoratedButton;
    @FXML
    public Button stageStyleTransparentButton;
    @FXML
    public Button stageStyleUtilityButton;
    @FXML
    public Button stageStyleUnifiedButton;

    @FXML
    public void onModalityNoneButtonClick() {
        // create a new stage (window) to show when the button is clicked
        Stage modalityNoneStage = new Stage();
        // set the modality of the stage (window) to Modality.NONE
        modalityNoneStage.initModality(Modality.NONE);
        // set the title for the new stage (window)
        modalityNoneStage.setTitle("Stage with Modality NONE");
        // set the minimum width and height for the new stage (window)
        modalityNoneStage.setMinWidth(400.0);
        modalityNoneStage.setMinHeight(400.0);

        // create a Parent (container) for setting inside the scene of the new stage
        VBox container = new VBox();
        // set the alignment of the container to center, all the things inside the container will show in CENTER
        container.setAlignment(Pos.CENTER);

        // create a new node (item) for showing inside the scene
        Label label = new Label("You can click the previous window also!");
        // add the node (item) to the container
        container.getChildren().add(label);

        // create a new scene to be added to the stage, add the container to the scene
        Scene scene = new Scene(container);

        // add the scene to the new stage (window)
        modalityNoneStage.setScene(scene);

        // show the stage
        modalityNoneStage.show();
    }

    @FXML
    public void onApplicationModalButtonClick() throws IOException {
        // create a new stage
        Stage applicationModalStage = new Stage();

        // set the modality of the stage to APPLICATION_MODAL
        applicationModalStage.initModality(Modality.APPLICATION_MODAL);

        // load the view file to set on the stage instead of dynamically creating the node objects
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("application-modal-view.fxml"));

        // create a new scene for the stage, set the width and the height for the 400.0
        Scene scene = new Scene(fxmlLoader.load(), 400.0, 400.0);

        // set the title for the stage
        applicationModalStage.setTitle("Stage with Modality APPLICATION MODAL");

        // add the scene to the stage
        applicationModalStage.setScene(scene);

        // show the stage
        applicationModalStage.show();
    }

    @FXML
    public void createEmptyStage() {
        Stage stage = new Stage();
        stage.setTitle("EMPTY WINDOW AFTER WINDOW MODAL");
        stage.show();
    }

    @FXML
    public void onWindowModalButtonClick() throws IOException {
        // create a new stage
        Stage applicationModalStage = new Stage();

        // set the modality of the stage to WINDOW MODAL
        applicationModalStage.initModality(Modality.WINDOW_MODAL);

        // load the view file to set on the stage instead of dynamically creating the node objects
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("window-modal-view.fxml"));

        // create a new scene for the stage, set the width and the height for the 400.0
        Scene scene = new Scene(fxmlLoader.load(), 400.0, 400.0);

        // set the title for the stage
        applicationModalStage.setTitle("Stage with Modality WINDOW MODAL");

        // TODO: 21-02-2022 fix owner null issue; modality resets to NONE

        // add the scene to the stage
        applicationModalStage.setScene(scene);

        // show the stage
        applicationModalStage.show();
    }

    @FXML
    public void onStageStyleDecoratedButtonClick() {

    }

    @FXML
    public void onStageStyleUndecoratedButtonClick() {

    }

    @FXML
    public void onStageStyleTransparentButtonClick() {

    }

    @FXML
    public void onStageStyleUtilityButtonClick() {

    }

    @FXML
    public void onStageStyleUnifiedButtonClick() {

    }

}