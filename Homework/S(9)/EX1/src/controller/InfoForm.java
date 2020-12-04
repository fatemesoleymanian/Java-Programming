package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import model.entity.PersonInfo;
import model.service.PersonServ;

public class InfoForm extends Thread{

    @FXML
    private JFXButton SubBtn;

    @FXML
    private JFXTextField txtFiName;

    @FXML
    private JFXTextField txtLname;

    @FXML
    private JFXTextField txtFaName;

    @FXML
    private JFXTextField txtNc;

    @FXML
    private JFXRadioButton maleBtn;

    @FXML
    private ToggleGroup group;

    @FXML
    private JFXRadioButton femaleBtn;

    @FXML
    private JFXTextField txtEdu;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtPnum;

    @FXML
    private JFXTextField txtDate;



    @FXML
    public void pressSubBtn(ActionEvent actionEvent) throws Exception {
        if ( txtFiName.getText().compareTo("") == 0 || txtLname.getText().compareTo("") == 0 || txtFaName.getText().compareTo("")==0 ||txtEmail.getText().compareTo("")==0||txtDate.getText().compareTo("")==0||txtEdu.getText().compareTo("")==0||txtNc.getText().compareTo("")==0||txtPnum.getText().compareTo("")==0|| (femaleBtn.isSelected()==false && maleBtn.isSelected()==false)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("warning dialog");
            alert.setHeaderText(null);
            alert.setContentText("please answer all questions!");
            alert.showAndWait();
        } else {

            if (femaleBtn.isSelected()){
                PersonServ.getInstance().save(new PersonInfo().setFiName(txtFiName.getText()).setlName(txtLname.getText()).setFaName(txtFaName.getText()).setEmail(txtEmail.getText()).setBirth(txtDate.getText()).setEdu(txtEdu.getText()).setNc(txtNc.getText()).setpNum(txtPnum.getText()).setGender(femaleBtn.getText()));

            }if (maleBtn.isSelected()){
                PersonServ.getInstance().save(new PersonInfo().setFiName(txtFiName.getText()).setlName(txtLname.getText()).setFaName(txtFaName.getText()).setEmail(txtEmail.getText()).setBirth(txtDate.getText()).setEdu(txtEdu.getText()).setNc(txtNc.getText()).setpNum(txtPnum.getText()).setGender(maleBtn.getText()));


            }

            Stage stage = (Stage) SubBtn.getScene().getWindow();
            stage.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("information dialog");
            alert.setHeaderText(null);
            alert.setContentText("your information have been saved .");
            alert.showAndWait();

        }



    }
    }

