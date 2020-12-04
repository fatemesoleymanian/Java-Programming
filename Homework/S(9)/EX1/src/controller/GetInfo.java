package controller;

import com.jfoenix.controls.JFXListView;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;


import java.sql.*;


public class GetInfo extends Thread  {

    @FXML
    private Button exitBtn;

    @FXML
    private JFXListView<String> InfoLV;

    final ObservableList<String> ClientPersonalInfo= FXCollections.observableArrayList();



    @FXML
    void pressexitBtn(ActionEvent event) {
        Platform.exit();

    }



    public void initialize() throws ClassNotFoundException, SQLException {
        Connection connection;
        PreparedStatement preparedStatement;

            Class.forName ("oracle.jdbc.driver.OracleDriver");
            connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
            preparedStatement = connection.prepareStatement("SELECT * FROM empform ");
            ResultSet resultSet=preparedStatement.executeQuery ();
             while (resultSet.next()){
            String Firstname=resultSet.getString("firstname");
            String Lastname=resultSet.getString("lastname");
            String Fathername=resultSet.getString("fathername");
            String email=resultSet.getString("email");
            String pnum=resultSet.getString("phonenumber");
            String edu=resultSet.getString("edu");
            String Gender=resultSet.getString("gender");
            String birthdate=resultSet.getString("birthdate");
            String nc=resultSet.getString("nc");

            ClientPersonalInfo.add(Firstname+" \t"+Lastname+" \t"+Fathername+" \t"+email+" \t"+pnum+" \t"+edu+" \t"+Gender+" \t"+birthdate+" \t"+nc);
        }
        InfoLV.setItems(ClientPersonalInfo);



        }


}
