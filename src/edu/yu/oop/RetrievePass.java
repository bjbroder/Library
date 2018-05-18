package edu.yu.oop;

import javafx.event.ActionEvent;

public class RetrievePass{

    public static String formName = "RetrievePass.fxml";
    public static String formTitle = "OOPS Library Application - Password Retrieval";
    public static int formWidth = 225;
    public static int formHeight = 300;

    public void signIn_click(ActionEvent actionEvent) {

        Main.getInstance().loadForm(SignIn.formName,SignIn.formTitle,SignIn.formWidth,SignIn.formHeight);
    }
}
