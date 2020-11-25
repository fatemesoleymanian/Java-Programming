package model.repository;

import model.entity.UserEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserRepo()throws Exception{
        try{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
        connection.setAutoCommit (false);}
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void inserting(UserEntity userEntity)throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO UsersAccounts(user_name, name, password, email) VALUES (?,?,?,?)");
        preparedStatement.setString (1,userEntity.getUser_name());
        preparedStatement.setString (2,userEntity.getName());
        preparedStatement.setString (3,userEntity.getPassword());
        preparedStatement.setString (4,userEntity.getEmail());
        preparedStatement.executeUpdate ();
    }
    public boolean   selecting(String user_name, String  password)throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM UsersAccounts where user_name=? and password=?");
        preparedStatement.setString (1,user_name);
        preparedStatement.setString (2,password);
        ResultSet resultSet=preparedStatement.executeQuery ();
        boolean compare=false;

        while (resultSet.next ()){

            String usrName=resultSet.getString ("user_name");
            String pass=resultSet.getString ("password");
            if(user_name.compareTo(usrName)==0 && password .compareTo(pass)==0) {
                compare=true;

                break;
            }else { break;}


        }

        return compare;
    }
    public void commit() throws Exception{
        connection.commit ();
    }


    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();


    }}