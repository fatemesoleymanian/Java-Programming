package usc.ac.ir.model.repository;
import usc.ac.ir.model.entity.UserEntity;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserRepo()throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
        connection.setAutoCommit (false);
    }
    public void inserting(UserEntity userEntity)throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO UsersAccounts(user_name, name, password, email) VALUES (?,?,?,?)");
        preparedStatement.setString (1,userEntity.getUser_name());
        preparedStatement.setString (2,userEntity.getName());
        preparedStatement.setLong (3,userEntity.getPassword());
        preparedStatement.setString (4,userEntity.getEmail());
        preparedStatement.executeUpdate ();
    }
    public List<UserEntity> selecting(String user_name, long password)throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM UsersAccounts where user_name=? and password=?");
        preparedStatement.setString (1,user_name);
        preparedStatement.setLong (2,password);
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<UserEntity> userEntityList=new ArrayList<>();
        while (resultSet.next ()){
            UserEntity userEntity=new UserEntity ();
            userEntity.setUser_name (resultSet.getString ("user_name"));
            userEntity.setName (resultSet.getString ("name"));
            userEntity.setPassword (resultSet.getLong ("password"));
            userEntity.setEmail (resultSet.getString ("email"));
            userEntityList.add (userEntity);
        }
        return userEntityList;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();


    }
}
