package model.repository;
import model.entity.EmpInfo;

import java.sql.*;

public class EmpDb implements AutoCloseable{

    private static Connection connection;
    private static PreparedStatement preparedStatement;
    public EmpDb()throws Exception{
        try{
            Class.forName ("oracle.jdbc.driver.OracleDriver");
            connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
            connection.setAutoCommit (false);}
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void inserting(EmpInfo entity)throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO empform(firstname, lastname, fathername, email,phonenumber,edu,gender,birthdate,nc) VALUES (?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString (1,entity.getFiName());
        preparedStatement.setString (2,entity.getlName());
        preparedStatement.setString (3,entity.getFaName());
        preparedStatement.setString (4,entity.getEmail());
        preparedStatement.setString (5,entity.getpNum());
        preparedStatement.setString (6,entity.getEdu());
        preparedStatement.setString (7,entity.getGender());
        preparedStatement.setString (8,entity.getBirth());
        preparedStatement.setString (9,entity.getNc());
        preparedStatement.executeUpdate ();
    }
    public void commit() throws Exception{
        connection.commit ();
    }


    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();


    }
}
