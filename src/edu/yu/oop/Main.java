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
        SignIn.primaryStage = primaryStage;
        NewAcctForm.primaryStage= primaryStage;
        ForgotPass.primaryStage= primaryStage;
        new SignIn().load();
    }





    public static void main(String[] args) {
        launch(args);
    }
}