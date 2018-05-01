package edu.yu.oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
            primaryStage.setScene(new Scene(root, 400, 255));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadNewAcctForm(){
        try {

            Parent root = FXMLLoader.load(getClass().getResource("NewAcctForm.fxml"));
            primaryStage.setTitle("OOPS Library Application - New Account");
            primaryStage.setScene(new Scene(root, 456, 293));
            primaryStage.show();
        }
        catch (Exception e) {}
    }

    public void loadForgotPass(){
        try {

            Parent root = FXMLLoader.load(getClass().getResource("ForgotPass.fxml"));
            primaryStage.setTitle("OOPS Library Application - Forgot Password");
            primaryStage.setScene(new Scene(root, 386, 183));
            primaryStage.show();
        }
        catch (Exception e) {}
    }

    public static void main(String[] args) {
        launch(args);
    }
}
