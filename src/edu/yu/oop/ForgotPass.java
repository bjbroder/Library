package edu.yu.oop;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ForgotPass {

    public Button btnGetPass;
    public Hyperlink backToSignIn;

    public static Stage primaryStage;

    public void getPass(ActionEvent actionEvent){
        //need to make sure all fields are filled in
        //if not, give an error or just show same screen again
        //if yes, make sure fields are in the db and match up
        //if not, see line 18
        //if yes, show screen with password
    }

    public void load(){
        try {

            Parent root = FXMLLoader.load(getClass().getResource("ForgotPass.fxml"));
            primaryStage.setTitle("OOPS Library Application - Forgot Password");
            primaryStage.setScene(new Scene(root, 386, 183));
            primaryStage.show();
        }
        catch (Exception e) {}
    }

    public void hyperBack (ActionEvent actionEvent) {
        new SignIn().load();
    }


}