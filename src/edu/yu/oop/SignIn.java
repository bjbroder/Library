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

    public void btnLogin(ActionEvent actionEvent){
        //need to make sure there is a username and password filled in
        //if not, give an error or just show same screen again
        //if yes, make sure the username and password are in the db
        //if not, see line 18
        //if yes, go to homepage
    }

    public void hyperNewAcct(ActionEvent actionEvent){

        Main.getInstance().loadNewAcctForm();
    }

    public void hyperForgotPass (ActionEvent actionEvent) {
        Main.getInstance().loadNewAcctForm();
    }

    public void newAcct_click(ActionEvent actionEvent) {
        //System.out.print('got here');
    }
}
