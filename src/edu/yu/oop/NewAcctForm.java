package edu.yu.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.StageStyle;


public class NewAcctForm {

    public Button submit;
    public Hyperlink backToSignIn;

    public void btnCreateAccount(ActionEvent actionEvent) {
        //if pass == confPass and there is something in first, last, and an @ in email
        //create new customer
        //put first, last, email, pass into the db and spit out an id
        //Main.getInstance().load
    }

    public void hyperBack(ActionEvent actionEvent){

        Main.getInstance().loadSignIn();
    }


}
