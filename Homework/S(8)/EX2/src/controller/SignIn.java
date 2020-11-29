package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.Alert;

import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;
import model.repository.PersonRepo;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SignIn {
    public SignIn() throws ClassNotFoundException, SQLException { Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
    }


    @FXML
    private JFXButton signInBtn;

    @FXML
    private JFXButton signUpBtn;

    @FXML
    private JFXTextField txtUser;

    @FXML
    private  JFXPasswordField txtPass;


    @FXML
    private JFXButton changeBtn;

    @FXML
    private JFXTextField txtUsername2;

    @FXML
    private JFXTextField txtEmail2;

    @FXML
    private JFXRadioButton maleBtn;

    @FXML
    private JFXRadioButton femaleBtn;

    @FXML
    private ToggleGroup group;

    private Connection connection;
    private PreparedStatement preparedStatement;

    @FXML
    public void pressSignInBtn(ActionEvent actionEvent) throws Exception {
        if (txtPass.getText().compareTo("") == 0 || txtUser.getText().compareTo("") == 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("warning dialog");
            alert.setHeaderText(null);
            alert.setContentText("please answer all questions!");
            alert.showAndWait();

        } else {
            PersonRepo personRepo=new PersonRepo();
            boolean ans = personRepo.selecting(txtUser.getText(), txtPass.getText());
            if (ans == true) {
                Stage stage = (Stage) signInBtn.getScene().getWindow();
                stage.close();
                Stage primarystage = new Stage();
                AnchorPane root = FXMLLoader.load(getClass().getClassLoader().getResource("view/Edit.fxml"));

                Scene scene = new Scene(root, 495, 413);
                primarystage.setScene(scene);
                primarystage.show();

            } else {

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("warning dialog");
                alert.setHeaderText("not found account -_-");
                alert.setContentText("wrong Input !!");
                alert.showAndWait();

            }

        }
        };

    @FXML
    public void pressSignUpBtn(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) signUpBtn.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root= FXMLLoader.load(getClass().getClassLoader().getResource("view/SignUp.fxml"));
        Scene scene=new Scene(root,495,413);
        primaryStage.setScene(scene);
        primaryStage.show();
    }




        @FXML
        public void pressBtnChange(ActionEvent actionEvent) throws Exception {
            if (txtUsername2.getText().compareTo("") == 0|| txtEmail2.getText().compareTo("")==0||femaleBtn.isSelected()==false && maleBtn.isSelected()==false ) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("warning dialog");
                alert.setHeaderText(null);
                alert.setContentText("please answer all questions!");
                alert.showAndWait();

            }else {

                if (maleBtn.isSelected()){

                    preparedStatement = connection.prepareStatement("update users set gender=?,username=? where email= ?");

                    preparedStatement.setString(1, maleBtn.getText());
                    preparedStatement.setString(2, txtUsername2.getText());
                    preparedStatement.setString(3, txtEmail2.getText());
                    preparedStatement.executeUpdate();}



                if (femaleBtn.isSelected()){
                    preparedStatement = connection.prepareStatement("update users set gender=?,username=? where email = ?");

                    preparedStatement.setString(1, femaleBtn.getText());
                    preparedStatement.setString(2, txtUsername2.getText());
                    preparedStatement.setString(3, txtEmail2.getText());

                    preparedStatement.executeUpdate();}



            }
            Stage stage = (Stage) changeBtn.getScene().getWindow();
            stage.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("information dialog");
            alert.setHeaderText(null);
            alert.setContentText(" your account has been updated !");
            alert.showAndWait();

        }
    }








