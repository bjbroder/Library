package edu.yu.oop;


import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;


public class ForgotPass {

    public Button btnGetPass;
    public Hyperlink backToSignIn;

    public TextField first;
    public TextField last;
    public TextField email;

    public void getPass(ActionEvent actionEvent){

        String f = String.valueOf(first.getText());
        String l = String.valueOf(last.getText());
        String e = String.valueOf(email.getText());


        if (f.length() == 0 || l.length() == 0 || e.length() == 0) {
            Main.getInstance().errorAlert("Need All Fields To Retrieve Password");
            Main.getInstance().loadForgotPass();
        }
        else{
            //check to make sure fields are in db
            Main.getInstance().loadRetrievePass();
        }






    }

    public void back_click(ActionEvent actionEvent){

        Main.getInstance().loadSignIn();
    }


}
