package com.company;

import java.sql.*;

public class Employee {
    private static  Connection connection;
    private static  PreparedStatement preparedStatement ;

    public static String  insert (String  name, String  education ,String age ,String email)
            throws ClassNotFoundException, SQLException {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");

        preparedStatement=connection.prepareStatement ("INSERT INTO emp(name, edu, age, email) VALUES (?,?,?,?)");
        preparedStatement.setString (1,name);
        preparedStatement.setString (2,education);
        preparedStatement.setString (3,age);
        preparedStatement.setString (4,email);
        preparedStatement.executeUpdate ();

        preparedStatement.close ();
        connection.close ();


    return "your Info saved!";}
}
