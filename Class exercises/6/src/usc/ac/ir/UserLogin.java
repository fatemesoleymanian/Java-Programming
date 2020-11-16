package usc.ac.ir;

import java.sql.*;
import java.util.Scanner;

public class UserLogin {
    public String user_name;
    public long password;
    Scanner scanner=new Scanner(System.in);

    UserLogin(){
        System.out.println("******Dear User To Use Our Site's Services You Need To Login To Your Account !******");
    }
    public void getInfo(){

        System.out.println("user_name :");
        this.user_name=scanner.nextLine();
        System.out.println("password :");
        this.password=scanner.nextLong();
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                "h13")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from UsersAccounts where user_name=? and pasword=?");
            preparedStatement.setString(1, this.user_name);
            preparedStatement.setLong(2, this.password);
            ResultSet resultSet = preparedStatement.executeQuery();
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");

        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());

        }

    }
    public void showInfo(){

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                "h13")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from UsersAccounts where user_name=?");
            preparedStatement.setString(1, user_name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("You Have Successfully Login !");
                System.out.println("name: " + resultSet.getString("name"));
                System.out.println("password: " + resultSet.getLong("password"));
                System.out.println("user_name: " + resultSet.getString("user_name"));
                System.out.println("e-mail: " + resultSet.getString("email"));
            }


        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");

        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());

        }

    }

    }

