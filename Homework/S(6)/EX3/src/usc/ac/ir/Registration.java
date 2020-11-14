package usc.ac.ir;

import java.sql.*;
import java.util.Scanner;

public class Registration extends Student{
    Scanner scanner=new Scanner(System.in);
    Registration()
    {
        System.out.println("dear student enter requirement information ");
    }
    public void showInfo(){
        super.showInfo();
    }
    public void getInfo(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into Students (name,year_of_entrance,average_score) values (?,?,?)");
            //code is key

            System.out.println("full name :");
            setStName(scanner.nextLine());
            preparedStatement.setString(1,getStName() );

            System.out.println("year of entrance :");
            setEntYear(scanner.nextInt());
            preparedStatement.setInt(2,getEntYear() );

            System.out.println("average score :");
            setAverage(scanner.nextFloat());
            preparedStatement.setFloat(3,getAverage() );

            preparedStatement.executeUpdate();
            PreparedStatement preparedStatement2 =
                    connection.prepareStatement("select code from Students where name=? and year_of_entrance=? and average_score=? ");

            preparedStatement2.setString(1,getStName() );
            preparedStatement2.setInt(2,getEntYear() );
            preparedStatement2.setFloat(3, getAverage());

            ResultSet resultSet = preparedStatement2.executeQuery();
            setStCode(resultSet.getLong("user_code"));
            System.out.println("are you sure to save?(y/n)");
            String option=scanner.next();
            if(option.equals("y"))   System.out.println("Your information has been saved!");
            if(option.equals("n"))   connection.rollback();

            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");//not found the user?
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }


    }

}
