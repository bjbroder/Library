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


public class SignIn {

    public Button login;
    public Hyperlink newAcct;
    public Hyperlink forgotPass;

    public void btnLogin(ActionEvent actionEvent){
        //need to make sure there is a username and password filled in
        //if not, give an error or just show same screen again
        //if yes, make sure the username and password are in the db
        //if not, see line 18
        //if yes, go to homepage
    }

    public static Stage primaryStage;

    public void load() {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
            primaryStage.setTitle("OOPS Library Application");
            primaryStage.setScene(new Scene(root, 400, 255));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void hyperNewAcct(ActionEvent actionEvent){

        new NewAcctForm().load();
    }

    public void hyperForgotPass (ActionEvent actionEvent) {
        new ForgotPass().load();
    }

    public void newAcct_click(ActionEvent actionEvent) {

    }

}