package edu.yu.oop;

import java.sql.*;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.StageStyle;
import javafx.scene.control.Alert;


public class SignIn {

    public static String formName = "SignIn.fxml";
    public static String formTitle = "OOPS Library Application - Sign In";
    public static int formWidth = 350;
    public static int formHeight = 225;

    public Button login;
    public Hyperlink newAcct;
    public Hyperlink forgotPass;

    public TextField username;
    public PasswordField password;

    public void forgotPass_click(ActionEvent actionEvent) {
        Main.getInstance().loadForm(ForgotPass.formName,ForgotPass.formTitle,ForgotPass.formWidth,ForgotPass.formHeight);
    }

    public void login_click(ActionEvent actionEvent) {

        String user = String.valueOf(username.getText());
        String pass = String.valueOf(password.getText());

        if (user.length() == 0 || pass.length() == 0) {

            Main.getInstance().errorAlert( "Username And/Or Password Cannot Be Blank!");
            //Main.getInstance().loadSignIn();
            Main.getInstance().loadForm(formName,formTitle,formWidth,formHeight);
        }
        else {
            String findCustomer = "SELECT * FROM Customers WHERE Email='" + user + "' AND Password='" + pass + "'";
            try {
                ResultSet rs = Main.statement.executeQuery(findCustomer);
                if (rs.next()) {    Main.getInstance().loadForm(AccountHome.formName,AccountHome.formTitle,AccountHome.formWidth,AccountHome.formHeight);}
            } catch (SQLException e) {
                System.out.println("Error!" + e.getErrorCode());
            }
        }
    }


    public void newAcct_click(ActionEvent actionEvent) {
        Main.getInstance().loadForm(NewAcctForm.formName,NewAcctForm.formTitle,NewAcctForm.formWidth,NewAcctForm.formHeight);
    }
}
