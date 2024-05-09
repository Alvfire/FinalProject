package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;

public class Controller{
    private Stage stage;
    private Scene scene;
    @FXML
    private Button gohome;

    @FXML
    private Button choiceA, choiceB, choiceC;
    int count = 0;
    //static int correct = 0;
    //static int wrong = 0;
    @FXML
    private Label QuestionNum;
    @FXML
    private Label TheQuestion;
    @FXML
    private Button choiceD;
    @FXML
    private Label opt3;
    @FXML
    private Label opt4;
    @FXML
    private Label opt1;
    @FXML
    private Label opt2;
    @FXML
    private Label subtext;

    @FXML
    public void switchToScene1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Quiz.class.getResource("Quiz-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @Deprecated
    public void switchToScene2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Quiz.class.getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }
    @Deprecated
    public void goHome(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Quiz.class.getResource("Quiz-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void goResults(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Quiz.class.getResource("Results.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    @Deprecated
    public void close(ActionEvent event) {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        System.out.println("you have exited");
        stage.close();
    }
    @FXML
    public void loadQuestions() throws IOException {


        Questions questions = new Questions();
        True_false TF = new True_false();
        Choices choices = new Choices();
        Q2Choices choices2 = new Q2Choices();
        Q3Choices choices3 = new Q3Choices();
        Q4Choices choices4 = new Q4Choices();
        Choices TChoice = new Choices();
        Choices FChoice = new Choices();

        if (count == 1) {
            TheQuestion.setText(questions.Question1());
            opt1.setText(choices.choice1());
            opt2.setText(choices.choice2());
            opt3.setText(choices.choice3());
            opt4.setText(choices.choice4());
            QuestionNum.setText("Question 2 of 10");
        } else if (count == 2) {
            TheQuestion.setText(questions.Question2());
            opt1.setText(choices2.choice1());
            opt2.setText(choices2.choice2());
            opt3.setText(choices2.choice3());
            opt4.setText(choices2.choice4());
            QuestionNum.setText("Question 3 of 10");
        } else if (count == 3) {
            TheQuestion.setText(questions.Question3());
            opt1.setText(choices3.choice1());
            opt2.setText(choices3.choice2());
            opt3.setText(choices3.choice3());
            opt4.setText(choices3.choice4());
            QuestionNum.setText("Question 4 of 10");
        } else if (count == 4) {
            TheQuestion.setText(questions.Question4());
            opt1.setText(choices4.choice1());
            opt2.setText(choices4.choice2());
            opt3.setText(choices4.choice3());
            opt4.setText(choices4.choice4());
            QuestionNum.setText("Question 5 of 10");
        } else if (count == 5) {
            TheQuestion.setText(TF.Question1());
            opt1.setText(choices.TChoice());
            opt2.setText(choices.FChoice());
            opt3.setVisible(false);
            opt4.setVisible(false);
            choiceC.setVisible(false);
            choiceD.setVisible(false);
            QuestionNum.setText("Question 6 of 10");
            subtext.setText("True or False");
        } else if (count == 6) {
            TheQuestion.setText(TF.Question2());
            opt1.setText(choices.TChoice());
            opt2.setText(choices.FChoice());
            opt3.setVisible(false);
            opt4.setVisible(false);
            choiceC.setVisible(false);
            choiceD.setVisible(false);
            QuestionNum.setText("Question 7 of 10");
        } else if (count == 7) {
            TheQuestion.setText(TF.Question3());
            opt1.setText(choices.TChoice());
            opt2.setText(choices.FChoice());
            opt3.setVisible(false);
            opt4.setVisible(false);
            choiceC.setVisible(false);
            choiceD.setVisible(false);
            QuestionNum.setText("Question 8 of 10");
        } else if (count == 8) {
            TheQuestion.setText(TF.Question4());
            opt1.setText(choices.TChoice());
            opt2.setText(choices.FChoice());
            opt3.setVisible(false);
            opt4.setVisible(false);
            choiceC.setVisible(false);
            choiceD.setVisible(false);
            QuestionNum.setText("Question 9 of 10");
        } else if (count == 9) {
            TheQuestion.setText(TF.Question5());
            opt1.setText(choices.TChoice());
            opt2.setText(choices.FChoice());
            opt3.setVisible(false);
            opt4.setVisible(false);
            choiceC.setVisible(false);
            choiceD.setVisible(false);
            QuestionNum.setText("Question 10 of 10");
        } else if (count == 10){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Results.fxml"));
            Parent root = loader.load();
            ControllerResults controller = loader.getController();
            Scene nextScene = new Scene(root);
            Stage stage = (Stage) TheQuestion.getScene().getWindow();
            stage.setScene(nextScene);
            stage.show();


        }

    }
    @FXML
    public void onBclicked(ActionEvent actionEvent) throws IOException {
        count ++;
        loadQuestions();

    }

    @FXML
    public void onAclicked(ActionEvent actionEvent) throws IOException {
        count++;
        loadQuestions();
    }

    @FXML
    public void onDclicked(ActionEvent actionEvent) throws IOException {
        count++;
        loadQuestions();
    }

    @FXML
    public void onCclicked(ActionEvent actionEvent) throws IOException {
        count++;
        loadQuestions();
    }
}




