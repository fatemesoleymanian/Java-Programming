package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import model.entity.Person;
import model.service.PersonServ;

public class SignUp {

    @FXML
    private JFXButton signUpBtn;

    @FXML
    private JFXTextField txtUsername;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXRadioButton maleBtn;

    @FXML
    private JFXRadioButton femaleBtn;

    @FXML
    private ToggleGroup group;

    @FXML
    private JFXPasswordField txtPass;
    @FXML
    public void pressBtnSignUp(ActionEvent actionEvent) throws Exception {
        if (txtPass.getText().equals("")  || txtUsername.getText().equals("") || txtEmail.getText().equals("")||femaleBtn.isSelected()==false && maleBtn.isSelected()==false ) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("warning dialog");
            alert.setHeaderText(null);
            alert.setContentText("please answer all questions!");
            alert.showAndWait();

        }else {
            if (maleBtn.isSelected() ){
                PersonServ.getInstance().save(new Person().setEmail(txtEmail.getText()).setPassword(txtPass.getText()).setUser_name(txtUsername.getText()).setGender(maleBtn.getText()));
        }if (femaleBtn.isSelected()){
                PersonServ.getInstance().save(new Person().setEmail(txtEmail.getText()).setPassword(txtPass.getText()).setUser_name(txtUsername.getText()).setGender(femaleBtn.getText()));
            }
                Stage stage = (Stage) signUpBtn.getScene().getWindow();
            stage.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("information dialog");
            alert.setHeaderText(null);
            alert.setContentText("now you have an account !");
            alert.showAndWait();
        }
    }




}
