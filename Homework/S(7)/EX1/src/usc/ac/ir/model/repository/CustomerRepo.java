package usc.ac.ir.model.repository;
import usc.ac.ir.model.entity.CustomerEntity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public CustomerRepo()throws Exception{
        try{Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
        connection.setAutoCommit (false);}catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");

        }
    }
    public void inserting(CustomerEntity customerEntity)throws Exception{
        try{preparedStatement=connection.prepareStatement ("INSERT INTO InternetUser(user_name, password, bill, local_traffic) VALUES (?,?,?,?)");
        preparedStatement.setString (1,customerEntity.getUser_name());
        preparedStatement.setLong (2,customerEntity.getPassword());
        preparedStatement.setLong (3,customerEntity.getBill());
        preparedStatement.setString (4,customerEntity.getLocal_traffic());
        preparedStatement.executeUpdate ();}
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());

        }


    }
    public void updating(CustomerEntity customerEntity)throws Exception{

        try{Class.forName ("oracle.jdbc.driver.OracleDriver");
            connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
            connection.setAutoCommit (false);
        preparedStatement=connection.prepareStatement ("UPDATE InternetUser SET bill=? , local_traffic=? WHERE user_name=? and password=?");
        preparedStatement.setLong (1,customerEntity.getBill ());
        preparedStatement.setString (2,customerEntity.getLocal_traffic ());
        preparedStatement.setString (3,customerEntity.getUser_name());
        preparedStatement.setLong (4,customerEntity.getPassword());
        preparedStatement.executeUpdate ();}
         catch (SQLException e) {
             System.out.println("DB ERROR " + e.getMessage());

         }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");

        }

        }
    public List<CustomerEntity> selecting(String user_name, long password)throws Exception{

        try{preparedStatement=connection.prepareStatement ("SELECT * FROM InternetUser where user_name=? and password=?");

        preparedStatement.setString (1,user_name);
        preparedStatement.setLong (2,password);
        }  catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());

        }

        ResultSet resultSet=preparedStatement.executeQuery ();
        List<CustomerEntity> customerEntityList=new ArrayList <> ();
        while (resultSet.next ()){
            CustomerEntity customerEntity1=new CustomerEntity();
            customerEntity1.setUser_name (resultSet.getString ("user_name"));
            customerEntity1.setPassword (resultSet.getLong ("password"));
            customerEntity1.setBill (resultSet.getLong ("bill"));
            customerEntity1.setLocal_traffic (resultSet.getString ("local_traffic"));
            customerEntityList.add (customerEntity1);
        }return customerEntityList;


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
