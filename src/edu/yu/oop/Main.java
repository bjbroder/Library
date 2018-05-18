package edu.yu.oop;

import java.io.IOException;
import java.sql.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application{

    public static Main getInstance() {
        return uniqueInstance;
    }

    static Main uniqueInstance;
    Stage primaryStage;
    static Statement statement;


    @Override
    public void start(Stage primaryStage) throws Exception {
        uniqueInstance = this;
        this.primaryStage = primaryStage;
        loadForm(SignIn.formName,SignIn.formTitle,SignIn.formWidth,SignIn.formHeight);
    }

    //This code comes up a lot so I wanted to make it easily sharable
    public void errorAlert (String errorMessage){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Error");
        alert.setHeaderText("Account Information Error");
        alert.setContentText(errorMessage);
        alert.showAndWait();
    }

    //so much repeated code when loading forms, also now each form will know what itself wants to be called/look like which makes more sense than someone else knowing
    //I recognize that this isn't ideal because this means that the other classes need to know how to get the name,title,width,and height but I had trouble just inputting the class
    public void loadForm(String formName, String formTitle, int formWidth, int formHeight) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(formName));
            primaryStage.setTitle(formTitle);
            primaryStage.setScene(new Scene(root, formWidth, formHeight));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Brielle\\Documents\\GitHub\\Library\\library.sqlite");
            statement = conn.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        launch(args);
    }




}
