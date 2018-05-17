package edu.yu.oop;


import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.StageStyle;


public class ForgotPass {

    public Button btnGetPass;
    public Hyperlink backToSignIn;

    public void getPass(ActionEvent actionEvent){
        //need to make sure all fields are filled in
        //if not, give an error or just show same screen again
        //if yes, make sure fields are in the db and match up
        //if not, see line 18
        //if yes, show screen with password
    }

    public void back_click(ActionEvent actionEvent){

        Main.getInstance().loadSignIn();
    }


}
