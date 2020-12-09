package src.BankRemote;

import java.sql.*;

public class ClientRepo {
    public String balance;

    private Connection connection;
    private PreparedStatement preparedStatement;

    public ClientRepo()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hanie","h13");
        connection.setAutoCommit (false);
    }

    public String select(Client client)throws Exception

    {
        preparedStatement = connection.prepareStatement("select balance from bank where accnum=? and pass=?");

        preparedStatement.setString(1,client.getAccNum());
        preparedStatement.setString(2,client.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next())
        {

             balance=resultSet.getString("balance");


        }connection.commit();

        return balance;
    }
    public void update(Client client,String amount,String reciever)throws Exception{

        PreparedStatement preparedStatement = connection.prepareStatement ("update bank set balance=balance-? where accnum=?");
        preparedStatement.setString (1, amount);
        preparedStatement.setString (2,client.getAccNum());
        System.out.println ("There is a withdraw from first account: "+preparedStatement.executeUpdate());

       PreparedStatement preparedStatement2 = connection.prepareStatement ("update bank set balance=balance+? where accnum=?");
        preparedStatement2.setString (1, amount);
        preparedStatement2.setString (2, reciever);
        System.out.println ("There is a deposit into second account: "+preparedStatement2.executeUpdate());

        connection.commit ();
    }


}
