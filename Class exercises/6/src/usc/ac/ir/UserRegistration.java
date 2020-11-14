package usc.ac.ir;

import java.sql.*;
import java.util.Scanner;

public class UserRegistration {
    Scanner scanner=new Scanner(System.in);
    public String user_name;
    public String email;
    public String name;
    public String password;
    UserRegistration(){
        System.out.println("******Dear User To Use Our Site's Services You Need To Register !******");
    }
    public void getInfo(){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                "hjh79")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection.setAutoCommit (false);
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into UserAccounts (name,password,e-mail) values (?,?,?)");
            //user name is primary key
            System.out.println("name :");
            this.name=scanner.next();
            preparedStatement1.setString(1, this.name);
            System.out.println("password :");
            this.password=scanner.next();
            preparedStatement1.setString(2,this.password );

            System.out.println("e-mail address :");
            this.email=scanner.next();
            preparedStatement1.setString(3, this.email);
            preparedStatement1.executeUpdate();

            PreparedStatement preparedStatement2 =
                    connection.prepareStatement("select user_name from UserAccounts where name=? and password=? and e-mail=? ");

            preparedStatement2.setString(1,this.name );
            preparedStatement2.setString(2,this.password );
            preparedStatement2.setString(3, this.email);

            ResultSet resultSet = preparedStatement2.executeQuery();
            this.user_name=resultSet.getString("user_name");
            connection.commit ();
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }


    }
    public void showInfo(){
        System.out.println("You Have Successfully Registered !");
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                "hjh79")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from UsersAccounts where user_name=?");
        preparedStatement.setString(1, this.user_name);
        ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("name: "+resultSet.getString("name"));
            System.out.println("password: "+resultSet.getString("password"));
            System.out.println("user_name: "+resultSet.getString("user_name"));
            System.out.println("e-mail: "+resultSet.getString("e-mail"));

        } catch (ClassNotFoundException e)
    {
        System.out.println("DB Driver Not Exist!!");
    } catch (SQLException e)
    {
        System.out.println("DB ERROR " + e.getMessage());
    }

    }
}
