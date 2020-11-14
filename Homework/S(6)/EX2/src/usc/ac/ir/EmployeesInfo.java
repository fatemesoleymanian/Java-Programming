package usc.ac.ir;
import java.sql.*;
import java.util.*;

public class EmployeesInfo extends Employees{
    Scanner scanner=new Scanner(System.in);

    public void showInfo(){
        System.out.println("here are your information !!");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where code=?");
            preparedStatement.setLong(1, (Long) code);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("code: "+resultSet.getLong("code"));
            System.out.println("name: "+resultSet.getString("name"));
            System.out.println("national code: "+resultSet.getLong("national_code"));
            System.out.println("father name: "+resultSet.getString("father_name"));
            System.out.println("career position: "+resultSet.getString("career_position"));
            System.out.println("salary: "+resultSet.getLong("salary"));
            System.out.println("work experience: "+resultSet.getString("work_experience"));

        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }


    public void getInfo(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into employees (name,national_code,father_name,career_position,salary,work_experience) values (?,?,?,?,?,?,?)");


            System.out.println("name :");
            name=scanner.next();
            preparedStatement.setString(1, (String) name);
            System.out.println("national code:");
            nationalCode=scanner.nextLong();
            preparedStatement.setLong(2, (Long) nationalCode);
            System.out.println("father name :");
            fathername=scanner.next();
            preparedStatement.setString(3, (String) fathername);
            System.out.println("career position :");
            careerposition=scanner.nextLine();
            preparedStatement.setString(4, (String) careerposition);
            System.out.println("salary :");
            salary=scanner.nextLong();
            preparedStatement.setLong(5, (Long) salary);
            System.out.println("work experience :");
            workexperience=scanner.nextLine();
            preparedStatement.setString(6, (String) workexperience);
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement2 =
                    connection.prepareStatement("select code from employees where national_code=? and father_name=? and name=? and career_position=? and salary=? and work_experience=?");
            preparedStatement2.setLong(1, (Long) nationalCode);
            preparedStatement2.setString(2, (String) fathername);
            preparedStatement2.setString(3, (String) name);
            preparedStatement2.setString(4, (String) careerposition);
            preparedStatement2.setLong(5, (Long) salary);
            preparedStatement2.setString(6, (String) workexperience);
            ResultSet resultSet = preparedStatement2.executeQuery();
            code=resultSet.getLong("code");

            preparedStatement2.close();
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
    public void deleteInfo(){
        System.out.println("code :");
        code=scanner.nextLong();
        System.out.println("national code :");
        nationalCode=scanner.nextLong();
        showInfo();

        System.out.println("are you sure to delete your information? y/n( your information would be deleted forever! )");
        String ans=scanner.next();

        if(ans.equals("y") || ans.equals("yes") || ans.equals("Yes") || ans.equals("Y")) {
            try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79")) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                PreparedStatement preparedStatement = connection.prepareStatement("delete from person where code=? ");
                preparedStatement.setLong(1, (Long) code);
                preparedStatement.executeUpdate();
                System.out.println("your information has been deleted successfully!!");
                preparedStatement.close();
                connection.close();
            } catch (ClassNotFoundException e)// if no lib files are added
            {
                System.out.println("DB Driver Not Exist!!");
            } catch (SQLException e) {
                System.out.println("DB ERROR " + e.getMessage());
            }
        }
    }
}
