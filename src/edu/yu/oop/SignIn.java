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

        if (user.length() == 0 || pass.length() == 0) {

            Main.getInstance().errorAlert( "Username And/Or Password Cannot Be Blank!");
            Main.getInstance().loadSignIn();
        }
        else {
            String findCustomer = "SELECT * FROM Customers WHERE Email=" + user + "AND Password=" + pass;
            try {
                ResultSet rs = Main.statement.executeQuery(findCustomer);
                if (rs.next()) {    Main.getInstance().loadAccountHome();}
            } catch (SQLException e) {
                System.out.println("Error!" + e.getErrorCode());
            }
        }
    }


    public void newAcct_click(ActionEvent actionEvent) {
        Main.getInstance().loadNewAcctForm();
    }
}
