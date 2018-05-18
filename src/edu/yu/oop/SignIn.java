package edu.yu.oop;

import java.sql.*;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.StageStyle;
import javafx.scene.control.Alert;


public class SignIn {

    public Button login;
    public Hyperlink newAcct;
    public Hyperlink forgotPass;

    public TextField username;
    public PasswordField password;

    public void forgotPass_click(ActionEvent actionEvent) {
        Main.getInstance().loadForgotPass();
    }

    public void login_click(ActionEvent actionEvent) {

        String user = String.valueOf(username.getText());
        String pass = String.valueOf(password.getText());

        int acceptableUserPass = Main.getInstance().checkUserPass(user,pass,"Username and/or Password Cannot Be Blank!");

        if (acceptableUserPass == 0) {
            Main.getInstance().loadSignIn();
        }
        else {
            //CHECK TO MAKE SURE VALUES ARE IN DB
            Main.getInstance().loadAccountHome();
        }
    }


    public void newAcct_click(ActionEvent actionEvent) {
        Main.getInstance().loadNewAcctForm();
    }
}
