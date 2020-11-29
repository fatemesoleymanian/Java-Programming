package model.repository;

import model.entity.Person;

import java.sql.*;

public class PersonRepo implements  AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public PersonRepo() throws ClassNotFoundException, SQLException {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
        connection.setAutoCommit (false);
    }
    public void insert(Person person) throws SQLException {
        preparedStatement = connection.prepareStatement("insert into users(username, password,gender,email) values (?, ?,?,?)");
        preparedStatement.setString(1, person.getUser_name());
        preparedStatement.setString(2, person.getPassword());
        preparedStatement.setString(3, person.getGender());
        preparedStatement.setString(4, person.getEmail());
        preparedStatement.executeUpdate();
    }

    public void update(Person person) throws SQLException {
        preparedStatement = connection.prepareStatement("update users set email = ?,gender=?,username=? where password = ?");
        preparedStatement.setString(1, person.getEmail());
        preparedStatement.setString(2, person.getGender());
        preparedStatement.setString(3, person.getUser_name());
        preparedStatement.setString(4, person.getPassword());
        preparedStatement.executeUpdate();
    }
    public boolean   selecting(String user_name, String  password)throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM users where username=? and password=?");
        preparedStatement.setString (1,user_name);
        preparedStatement.setString (2,password);
        ResultSet resultSet=preparedStatement.executeQuery ();
        boolean compare=false;

        while (resultSet.next ()){

            String usrName=resultSet.getString ("username");
            String pass=resultSet.getString ("password");
            if(user_name.compareTo(usrName)==0 && password .compareTo(pass)==0) {
                compare=true;

                break;
            }else { break;}


        }

        return compare;
    }



    public void commit() throws SQLException{
        connection.commit();
    }

    public void rollBack() throws SQLException{
        connection.rollback();
    }

    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();

    }
}
