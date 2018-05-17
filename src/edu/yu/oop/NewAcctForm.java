package edu.yu.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.StageStyle;


public class NewAcctForm {

    public Button submit;
    public Hyperlink backToSignIn;

    public void submitNewAcct_click(ActionEvent actionEvent) {
        Main.getInstance().loadAccountHome();
    }

    public void signIn_click(ActionEvent actionEvent){

        Main.getInstance().loadSignIn();
    }


}
