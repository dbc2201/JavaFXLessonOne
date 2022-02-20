package io.github.dbc.javafxlessonone.controller;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
    public void onApplicationModalButtonClick() {

    }

    @FXML
    public void onWindowModalButtonClick() {

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