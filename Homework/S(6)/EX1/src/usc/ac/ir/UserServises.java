
package usc.ac.ir;

import java.sql.*;
import java.util.Scanner;

public class UserServises {
    public long userCode;
    public String userName;
    public String email;
    public String password;
    public int age;
    public String education;
    Scanner scanner=new Scanner(System.in);
    public void signUp(){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into UserServices (user_name,e-mail,password,age,education) values (?,?,?,?,?)");

            System.out.println("user name :");
            this.userName=scanner.next();
            preparedStatement.setString(1,this.userName );
            System.out.println("email :");
            this.email=scanner.next();
            preparedStatement.setString(2,this.email );
            System.out.println("password :");
            this.password=scanner.next();
            preparedStatement.setString(3,this.password );
            System.out.println("age :");
            this.age=scanner.nextInt();
            preparedStatement.setInt(4,this.age );
            System.out.println("education :");
            this.education=scanner.nextLine();
            preparedStatement.setString(5,this.education );
            preparedStatement.executeUpdate();
            PreparedStatement preparedStatement2 =
                    connection.prepareStatement("select user_code from UserServices where user_name=? ,password=? ,e-mail=? ,age=? ,education=?");

            preparedStatement2.setString(1,this.userName );
            preparedStatement2.setString(2,this.password );
            preparedStatement2.setString(3, this.email);
            preparedStatement2.setInt(4, this.age);
            preparedStatement2.setString(5, this.education);

            ResultSet resultSet = preparedStatement2.executeQuery();
            this.userCode=resultSet.getLong("user_code");
            preparedStatement.close();
            connection.close();
            System.out.println("You Successfully Signed up!");
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");//not found the user?
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }

    }
    public void update(){
        System.out.println("user name");
        this.userName=scanner.next();
        System.out.println("user code");
        this.userCode=scanner.nextLong();
        showInfo();
        System.out.println("you can change your information ");
        System.out.println("user name :");
        this.userName=scanner.next();
        System.out.println("email :");
        this.email=scanner.next();
        System.out.println("password :");
        this.password=scanner.next();
        System.out.println("age :");
        this.age= Integer.parseInt(scanner.nextLine());
        System.out.println("education :");
        this.education=scanner.nextLine();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("update UsersServices set user_name=? ,e-mai=? ,password=? ,age=? ,education=? where user_code=?");

            preparedStatement.setString(1, this.userName);

            preparedStatement.setString(2, this.email);

            preparedStatement.setString(3, this.password);

            preparedStatement.setInt(4, this.age);

            preparedStatement.setString(5, this.education);

            preparedStatement.setLong(6,this.userCode);
           
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            System.out.println("your information has been updated!");
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }

    }
    public void showInfo(){
        System.out.println("here are your information !!");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from UserServices where user_code=?");
            preparedStatement.setLong(1,this.userCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("user code: "+resultSet.getLong("user_code"));
            System.out.println("user name: "+resultSet.getString("user_name"));
            System.out.println("email address: "+resultSet.getString("e-mail"));
            System.out.println("password: "+resultSet.getString("password"));
            System.out.println("age: "+resultSet.getInt("age"));
            System.out.println("education: "+resultSet.getString("education"));

    } catch (ClassNotFoundException e)
    {
        System.out.println("DB Driver Not Exist!!");
    } catch (SQLException e)
    {
        System.out.println("DB ERROR " + e.getMessage());
    }
    }
}
