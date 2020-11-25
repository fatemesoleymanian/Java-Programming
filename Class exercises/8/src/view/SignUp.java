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

public class SignUp {

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXPasswordField txtPass;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXButton btnSignUp;

    @FXML
    public void pressbTnSignUp(javafx.event.ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().compareTo("") == 0 || txtPass.getText().compareTo("") == 0 || txtName.getText().compareTo("")==0 ||txtEmail.getText().compareTo("")==0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("warning dialog");
            alert.setHeaderText(null);
            alert.setContentText("please fill the all blanks !");
            alert.showAndWait();
        } else {
            UserController userController=new UserController();
            userController.registration(txtUserName.getText(),txtName.getText(),txtPass.getText(),txtEmail.getText());

            Stage stage = (Stage) btnSignUp.getScene().getWindow();
            stage.close();
            Stage primarystage = new Stage();
            DialogPane root =  FXMLLoader.load(getClass().getResource("Success.fxml"));
            Scene scene = new Scene(root, 360, 87);
            primarystage.setScene(scene);
            primarystage.show();

        }
    }
}
