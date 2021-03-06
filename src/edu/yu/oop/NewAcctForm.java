package edu.yu.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

import java.sql.ResultSet;
import java.sql.SQLException;


public class NewAcctForm {

    public static String formName = "NewAcctForm.fxml";
    public static String formTitle = "OOPS Library Application - New Account";
    public static int formWidth = 456;
    public static int formHeight = 293;

    public Button submit;
    public Hyperlink backToSignIn;

    public TextField first;
    public TextField last;
    public TextField email;
    public TextField password;
    public TextField confPass;

    public void submitNewAcct_click(ActionEvent actionEvent) {

        String user = String.valueOf(email.getText());
        String fName = String.valueOf(first.getText());
        String lName = String.valueOf(last.getText());
        String pass = String.valueOf(password.getText());
        String pass2 = String.valueOf(confPass.getText());

        if (user.length() == 0 || fName.length() == 0 || lName.length() == 0 || pass.length() == 0) {

            Main.getInstance().errorAlert( "Fields Cannot Be Blank!");
            Main.getInstance().loadForm(formName,formTitle,formWidth,formHeight);
        }

        else {
            if (pass.compareTo(pass2) != 0) {
                Main.getInstance().errorAlert("Confirmation Password Does Not Match Original Password");
                Main.getInstance().loadForm(formName,formTitle,formWidth,formHeight);
            }

            else {
                String insertCustomer = "INSERT INTO Customers (First, Last, Email, Password) VALUES ( '"+ fName + "', '"+ lName +"', '" + user + "', '" + pass + "')";
                try {
                    Main.statement.executeUpdate(insertCustomer);
                } catch (SQLException e) {
                    System.out.println("Error! " + e.getErrorCode());
                    System.out.println(e);
                }
                Main.getInstance().loadForm(AccountHome.formName,AccountHome.formTitle, AccountHome.formWidth,AccountHome.formHeight);
            }
        }
    }

    public void signIn_click(ActionEvent actionEvent){

        Main.getInstance().loadForm(SignIn.formName,SignIn.formTitle,SignIn.formWidth,SignIn.formHeight);
    }


}
