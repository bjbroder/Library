package edu.yu.oop;


import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;


public class ForgotPass {

    public static String formName = "ForgotPass.fxml";
    public static String formTitle = "OOPS Library Application - Forgot Password";
    public static int formWidth = 300;
    public static int formHeight = 215;

    public Button getPass;
    public Hyperlink backToSignIn;

    public TextField first;
    public TextField last;
    public TextField email;

    public void getPass_click(ActionEvent actionEvent){

        String f = String.valueOf(first.getText());
        String l = String.valueOf(last.getText());
        String e = String.valueOf(email.getText());


        if (f.length() == 0 || l.length() == 0 || e.length() == 0) {
            Main.getInstance().errorAlert("Need All Fields To Retrieve Password");
            Main.getInstance().loadForm(formName,formTitle,formWidth,formHeight);
        }
        else{
            //check to make sure fields are in db
            Main.getInstance().loadForm(RetrievePass.formName,RetrievePass.formTitle,RetrievePass.formWidth,RetrievePass.formHeight);
        }






    }

    public void back_click(ActionEvent actionEvent){

        Main.getInstance().loadForm(SignIn.formName,SignIn.formTitle,SignIn.formWidth,SignIn.formHeight);
    }


}
