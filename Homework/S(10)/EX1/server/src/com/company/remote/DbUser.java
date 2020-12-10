package com.company.remote;

import java.sql.*;

public class DbUser implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;

    DbUser()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hanie","h13");
    }

    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();


    }
    public void insert(User user)throws Exception
    {
        preparedStatement=connection.prepareStatement("insert into client (id,pass) values (?,?)");
        preparedStatement.setString(1,user.getId());
        preparedStatement.setString(2,user.getPass());
        preparedStatement.executeUpdate();
    }
    public boolean checkANDupdate(User user,String password)throws Exception
    {
        preparedStatement=connection.prepareStatement("select * from client where id=? and pass=?");

        preparedStatement.setString(1,user.getId());
        preparedStatement.setString(2,user.getPass());
        ResultSet resultSet=preparedStatement.executeQuery();
        boolean compare=false;
        while (resultSet.next()){
            String id=resultSet.getString("id");
            String pass=resultSet.getString("pass");
            if (user.getId().compareTo(id)==0 && user.getPass().compareTo(pass)==0) { compare=true; break;}
            else {System.out.println("wrong input"); break;}
        }
        if (compare==true){
            preparedStatement=connection.prepareStatement("update client set pass=? where id=? ");
            preparedStatement.setString(1,password);
            preparedStatement.setString(2,user.getId());
            preparedStatement.executeUpdate();
        }


    return compare;}
}
