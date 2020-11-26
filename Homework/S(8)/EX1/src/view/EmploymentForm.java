package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import controller.ControllInfo;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class EmploymentForm {

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
    private JFXRadioButton femaleBtn;

    @FXML
    private JFXTextField txtDate;

    @FXML
    private JFXTextField txtEdu;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtPnum;

    @FXML

    public void pressSubBtn(javafx.event.ActionEvent actionEvent) {
        if ( txtFiName.getText().compareTo("") == 0 || txtLname.getText().compareTo("") == 0 || txtFaName.getText().compareTo("")==0 ||txtEmail.getText().compareTo("")==0||txtDate.getText().compareTo("")==0||txtEdu.getText().compareTo("")==0||txtNc.getText().compareTo("")==0||txtPnum.getText().compareTo("")==0|| (femaleBtn.isSelected()==false && maleBtn.isSelected()==false)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("warning dialog");
            alert.setHeaderText(null);
            alert.setContentText("please answer all questions!");
            alert.showAndWait();
        } else {
            ControllInfo controllInfo=new ControllInfo();

            controllInfo.fill(txtFiName.getText(),txtLname.getText(),txtFaName.getText(),txtNc.getText(),femaleBtn.getText(),txtDate.getText(),txtEdu.getText(),txtPnum.getText(),txtEmail.getText());
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
