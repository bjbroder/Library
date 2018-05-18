package edu.yu.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

public class AccountHome {

    public static String formName = "AccountHome.fxml";
    public static String formTitle = "OOPS Library Application - Account Homepage";
    public static int formWidth = 600;
    public static int formHeight = 380;

    public Button browse;
    public Button myAcct;
    public Button returnItems;
    public Button checkOut;

    public Hyperlink signOut;

    public Label itemsOut;
    public Label curCart;

    public void browse_click(ActionEvent actionEvent) {

    }

    public void checkOut_click(ActionEvent actionEvent) {
    }

    public void returnItems_click(ActionEvent actionEvent) {
    }

    public void myAcct_click(ActionEvent actionEvent) {
    }

    public void signOut_click(ActionEvent actionEvent) {
        //curCart = 0;
        Main.getInstance().loadForm(SignIn.formName,SignIn.formTitle,SignIn.formWidth,SignIn.formHeight);
    }
}
