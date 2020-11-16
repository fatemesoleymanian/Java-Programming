package usc.ac.ir;

import java.sql.*;
import java.util.Scanner;

public class UserRegistration {

    public String user_name;
    public String email;
    public String name;
    public long password;
    Scanner scanner=new Scanner(System.in);
    UserRegistration(){
        System.out.println("******Dear User To Use Our Site's Services You Need To Register !******");
    }
    public void getInfo(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "h13");


            PreparedStatement preparedStatement = connection.prepareStatement("insert into UsersAccounts (user_name,name,password,email) values (?,?,?,?)");
            System.out.println("user name :");
            this.user_name=scanner.next();
            preparedStatement.setString(1, this.user_name);
            System.out.println("name :");
            this.name=scanner.next();
            preparedStatement.setString(2, this.name);
            System.out.println("password :");
            this.password=scanner.nextLong();
            preparedStatement.setLong(3,this.password );

            System.out.println("e-mail address :");
            this.email=scanner.next();
            preparedStatement.setString(4, this.email);
            preparedStatement.executeUpdate();


        } catch (SQLException | ClassNotFoundException e)
        {
            System.out.println("DB ERROR "+ e.getMessage() );
        }


    }
    public void showInfo(){
        System.out.println("You Have Successfully Registered !");
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                "h13")) {

        PreparedStatement preparedStatement = connection.prepareStatement("select * from UsersAccounts where user_name=?");
        preparedStatement.setString(1, this.user_name);
        ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("name: " + resultSet.getString("name"));
                System.out.println("password: " + resultSet.getLong("password"));
                System.out.println("user_name: " + resultSet.getString("user_name"));
                System.out.println("e-mail: " + resultSet.getString("email"));
            }
        } catch (SQLException e)
    {
        System.out.println("DB ERROR " + e.getMessage());
    }

    }
}
