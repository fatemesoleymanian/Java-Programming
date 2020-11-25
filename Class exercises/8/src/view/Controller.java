package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import controller.UserController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.entity.UserEntity;
import model.repository.UserRepo;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private JFXButton btnSignIn;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    public void pressBtnSignUp(javafx.event.ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) btnSignUp.getScene().getWindow();
        stage.close();
        Stage primarystage=new Stage();
        AnchorPane root= FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene=new Scene(root,419,440);
        primarystage.setScene(scene);
        primarystage.show();
    }



    @FXML
    public void pressBtnSignIn(javafx.event.ActionEvent actionEvent) throws Exception {
        if(txtUserName.getText().equals("") ||txtPassword.getText().equals("")){
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setTitle("warning dialog");
            alert.setHeaderText(null);
            alert.setContentText("please fill the all blanks !");
            alert.showAndWait();
        }else {
            UserController userController=new UserController();
           boolean ans=userController.logIn(txtUserName.getText(), txtPassword.getText());
            if (ans== true) {
                Stage stage=(Stage) btnSignIn.getScene().getWindow();
                stage.close();
                Stage primarystage=new Stage();
                DialogPane root= FXMLLoader.load(getClass().getResource("Success.fxml"));
                Scene scene=new Scene(root,360,87);
                primarystage.setScene(scene);
                primarystage.show();

            }
            else {
                Stage stage=(Stage) btnSignIn.getScene().getWindow();
                stage.close();
                Stage primarystage=new Stage();
                DialogPane root= FXMLLoader.load(getClass().getResource("WrongInput.fxml"));
                Scene scene=new Scene(root,360,87);
                primarystage.setScene(scene);
                primarystage.show();

            }
        }
    }
}
