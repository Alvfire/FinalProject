package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerResults {
    @javafx.fxml.FXML
    private Button homeBtn;

    @javafx.fxml.FXML
    public void goHome(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Quiz-view.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene nextScene = new Scene(root);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(nextScene);
        stage.show();
    }
}
