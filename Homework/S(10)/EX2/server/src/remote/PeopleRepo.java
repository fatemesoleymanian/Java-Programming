package remote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PeopleRepo implements AutoCloseable {

    private Connection connection;
    private PreparedStatement preparedStatement;

    PeopleRepo()throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hanie","h13");

    }

    public void insert(People people)throws Exception
    {
        preparedStatement=connection.prepareStatement("insert into food (address,food,cost) values (?,?,?)");
        preparedStatement.setString(1,people.getAddress());
        preparedStatement.setString(2,people.getFood());
        preparedStatement.setString(3,people.getCost());
        preparedStatement.executeUpdate();
    }
    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();

    }
}
