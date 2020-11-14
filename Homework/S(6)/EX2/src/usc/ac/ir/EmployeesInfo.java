package usc.ac.ir;
import java.sql.*;
import java.util.*;

public class EmployeesInfo {
    Scanner scanner=new Scanner(System.in);
    Employees employees=new Employees();

    public void showInfo(){
        System.out.println("here are your information !!");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "h13");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where code=?");
            preparedStatement.setLong(1, (Long) employees.code);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("code: " + resultSet.getLong("code"));
                System.out.println("name: " + resultSet.getString("name"));
                System.out.println("national code: " + resultSet.getLong("national_code"));
                System.out.println("father name: " + resultSet.getString("father_name"));
                System.out.println("career position: " + resultSet.getString("career_position"));
                System.out.println("salary: " + resultSet.getLong("salary"));
                System.out.println("work experience: " + resultSet.getString("work_experience"));
            }

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
                    "h13");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into employees (code,name,national_code,father_name,career_position,salary,work_experience) values (?,?,?,?,?,?,?)");

            System.out.println("employee code :");
            employees.code=scanner.nextLong();
            preparedStatement.setLong(1, (long) employees.code);
            System.out.println("name :");
            employees.name=scanner.next();
            preparedStatement.setString(2, (String) employees.name);
            System.out.println("national code:");
            employees.nationalCode=scanner.nextLong();
            preparedStatement.setLong(3, (Long) employees.nationalCode);
            System.out.println("father name :");
            employees.fathername=scanner.next();
            preparedStatement.setString(4, (String) employees.fathername);
            System.out.println("career position :");
            employees.careerposition=scanner.next();
            preparedStatement.setString(5, (String) employees.careerposition);
            System.out.println("salary :");
            employees.salary=scanner.nextLong();
            preparedStatement.setLong(6, (Long) employees.salary);
            System.out.println("work experience :");
            employees.workexperience=scanner.next();
            preparedStatement.setString(7, (String) employees.workexperience);
            preparedStatement.executeUpdate();


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
        employees.code=scanner.nextLong();
        System.out.println("national code :");
        employees.nationalCode=scanner.nextLong();
        showInfo();

        System.out.println("are you sure to delete your information? y/n( your information would be deleted forever! )");
        String ans=scanner.next();

        if(ans.equals("y") || ans.equals("yes") || ans.equals("Yes") || ans.equals("Y")) {
            try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "h13")) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                PreparedStatement preparedStatement = connection.prepareStatement("delete from employees where code=? ");
                preparedStatement.setLong(1, (Long) employees.code);
                preparedStatement.executeUpdate();
                System.out.println("your information has been deleted successfully!!");
                preparedStatement.close();
                connection.close();
            } catch (ClassNotFoundException e)
            {
                System.out.println("DB Driver Not Exist!!");
            } catch (SQLException e) {
                System.out.println("DB ERROR " + e.getMessage());
            }
        }else showInfo();
    }
}
