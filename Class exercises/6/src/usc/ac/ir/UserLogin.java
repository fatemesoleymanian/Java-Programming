package usc.ac.ir;

import java.sql.*;
import java.util.Scanner;

public class UserLogin {
    public String user_name;
    public String password;
    Scanner scanner=new Scanner(System.in);

    UserLogin(){
        System.out.println("******Dear User To Use Our Site's Services You Need To Login To Your Account !******");
    }
    public void getInfo(){

        System.out.println("user_name :");
        this.user_name=scanner.nextLine();
        System.out.println("password :");
        this.password=scanner.nextLine();
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                "hjh79")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from UsersAccounts where user_name=? and pasword=?");
            preparedStatement.setString(1, this.user_name);
            preparedStatement.setString(2, this.password);
            ResultSet resultSet = preparedStatement.executeQuery();//??SQL exception? or class
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");

        } catch (SQLException e)
        {
            System.out.println("You Haven't Registered Yet!!");

        }

    }
    public void showInfo(){

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                "hjh79")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from UsersAccounts where user_name=?");
            preparedStatement.setString(1, user_name);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("You Have Successfully Login !");
            System.out.println("name: "+resultSet.getString("name"));
            System.out.println("password: "+resultSet.getString("password"));
            System.out.println("user_name: "+resultSet.getString("user_name"));
            System.out.println("e-mail: "+resultSet.getString("e-mail"));


        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");

        } catch (SQLException e)
        {
            System.out.println("You Haven't Registered Yet!!");

        }

    }

    }

