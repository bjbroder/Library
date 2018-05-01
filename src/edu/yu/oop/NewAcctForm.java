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


public class NewAcctForm {

    public Button submit;
    public Hyperlink backToSignIn;

    public static Stage primaryStage;

    public void load(){
        try {

            Parent root = FXMLLoader.load(getClass().getResource("NewAcctForm.fxml"));
            primaryStage.setTitle("OOPS Library Application - New Account");
            primaryStage.setScene(new Scene(root, 456, 293));
            primaryStage.show();
        }
        catch (Exception e) {}
    }


    public void btnCreateAccount(ActionEvent actionEvent) {
        //if pass == confPass and there is something in first, last, and an @ in email
        //create new customer
        //put first, last, email, pass into the db and spit out an id
        //Main.getInstance().load
    }

    public void hyperBack (ActionEvent actionEvent) {
        new SignIn().load();
    }


}