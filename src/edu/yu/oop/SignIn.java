package edu.yu.oop;


import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.StageStyle;


public class SignIn {

    public Button login;
    public Hyperlink newAcct;
    public Hyperlink forgotPass;

    public void forgotPass_click(ActionEvent actionEvent) {
        System.out.print("got here");
        Main.getInstance().loadForgotPass();
    }

    public void login_click(ActionEvent actionEvent) {
        //need to make sure there is a username and password filled in
        //if not, give an error or just show same screen again
        //if yes, make sure the username and password are in the db
        //if yes, go to homepage

        System.out.print("got here");
        Main.getInstance().loadAccountHome();
    }


    public void newAcct_click(ActionEvent actionEvent) {
        System.out.print("got here");
        Main.getInstance().loadNewAcctForm();
    }
}
