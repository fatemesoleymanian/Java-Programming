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
                    "h13");
            connection.setAutoCommit (false);
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into Students (user_code,name,year_of_entrance,average_score) values (?,?,?,?)");
            //code is key
            System.out.println("user code :");
            setStCode(scanner.nextLong());
            preparedStatement.setLong(1,getStCode() );
            System.out.println("full name :");
            setStName(scanner.next());
            preparedStatement.setString(2,getStName() );

            System.out.println("year of entrance :");
            setEntYear(scanner.nextInt());
            preparedStatement.setInt(3,getEntYear() );

            System.out.println("average score :");
            setAverage(scanner.nextFloat());
            preparedStatement.setFloat(4,getAverage() );

            preparedStatement.executeUpdate();

            System.out.println("are you sure to save?(y/n)");
            String option=scanner.next();
            if(option.equals("y")) {  System.out.println("Your information has been saved!"); }
            if(option.equals("n"))   connection.rollback();
            connection.commit();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }


    }

}
