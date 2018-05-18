package edu.yu.oop;

import java.sql.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application{

    public static Main getInstance() {
        return uniqueInstance;
    }

    static Main uniqueInstance;
    Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception {
        uniqueInstance = this;
        this.primaryStage = primaryStage;
        loadSignIn();
    }

    public void loadSignIn() {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
            primaryStage.setTitle("OOPS Library Application");
            primaryStage.setScene(new Scene(root, 350, 225));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadNewAcctForm(){
        try {
            System.out.print("trying to open new acct");
            Parent root = FXMLLoader.load(getClass().getResource("NewAcctForm.fxml"));
            primaryStage.setTitle("OOPS Library Application - New Account");
            primaryStage.setScene(new Scene(root, 456, 293));
            primaryStage.show();
        }
        catch (Exception e) {
            System.out.print("couldnt open new acct");
        }
    }

    public void loadForgotPass(){
        try {

            Parent root = FXMLLoader.load(getClass().getResource("ForgotPass.fxml"));
            primaryStage.setTitle("OOPS Library Application - Forgot Password");
            primaryStage.setScene(new Scene(root, 300, 215));
            primaryStage.show();
        }
        catch (Exception e) {

        }
    }

    public void loadAccountHome() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("AccountHome.fxml"));
            primaryStage.setTitle("OOPS Library Application - Account Homepage");
            primaryStage.setScene(new Scene(root, 600, 380));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    //This code comes up a lot so I wanted to make it easily sharable
    public void errorAlert (String errorMessage){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Error");
        alert.setHeaderText("Account Information Error");
        alert.setContentText(errorMessage);

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }


    public void loadRetrievePass() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("RetrievePass.fxml"));
            primaryStage.setTitle("OOPS Library Application - Password Retrieval");
            primaryStage.setScene(new Scene(root, 225, 300));
            primaryStage.show();
        }
        catch (Exception e) {
        }
    }
}
