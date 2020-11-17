package usc.ac.ir;
import java.sql.*;
import java.util.Scanner;
public class Update extends Student{
    Scanner scanner=new Scanner(System.in);
    Update(){
        System.out.println("to enter your page enter your student code .");
    }
    public void showInfo(){
        super.showInfo();
    }
    public void updating(){
        System.out.println("code :");
        setStCode(scanner.nextLong());

        super.showInfo();

        System.out.println("WHICH ONE DO YOU WANT TO UPDATE ?");
        System.out.println("1.your name\n2.the year of your entrance\n3.average of your scores\n4.all");
        int ans = scanner.nextInt();

        switch (ans)
        {
            case 1:

                try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                        "h13")) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    connection.setAutoCommit (false);
                    PreparedStatement preparedStatement = connection.prepareStatement("update Students set name=? where user_code=? ");
                    System.out.println("enter the replace name :");
                    setStName(scanner.next());
                    preparedStatement.setString(1, getStName());
                    preparedStatement.setLong(2, getStCode());
                    preparedStatement.executeUpdate();
                    System.out.println("are you sure to update?(y/n)");
                    String option=scanner.next();
                    if (option.equals("y"))
                        System.out.println("your name has been updated!!");

                    if (option.equals("n")) connection.rollback();
                    connection.commit();
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException e)
                {
                    System.out.println("DB Driver Not Exist!!");
                } catch (SQLException e) {
                    System.out.println("DB ERROR " + e.getMessage());
                }
                break;
            case 2:
                try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                        "h13")) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    connection.setAutoCommit (false);
                    PreparedStatement preparedStatement = connection.prepareStatement("update Students set year_of_entrance=?  where user_code=? ");
                    System.out.println("enter the replace year :");
                    setEntYear(scanner.nextInt());
                    preparedStatement.setInt(1, getEntYear());
                    preparedStatement.setLong(2, getStCode());
                    preparedStatement.executeUpdate();
                    System.out.println("are you sure to update?(y/n)");
                    String option=scanner.next();
                    if (option.equals("y"))
                        System.out.println("the year of your entrance has been updated!!");

                    if (option.equals("n")) connection.rollback();
                    connection.commit();
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException e)
                {
                    System.out.println("DB Driver Not Exist!!");
                } catch (SQLException e) {
                    System.out.println("DB ERROR " + e.getMessage());
                }
                break;
            case 3:
                try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                        "h13")) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    connection.setAutoCommit (false);
                    PreparedStatement preparedStatement = connection.prepareStatement("update Students set average_score=? where user_code=? ");
                    System.out.println("enter the replace average :");
                    setAverage(scanner.nextFloat());
                    preparedStatement.setFloat(1, getAverage());
                    preparedStatement.setLong(2, getStCode());
                    preparedStatement.executeUpdate();
                    System.out.println("are you sure to delete?(y/n)");
                    String option=scanner.next();
                    if (option.equals("y"))
                        System.out.println("the average of your scores has been deleted!!");

                    if (option.equals("n")) connection.rollback();
                    connection.commit();
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException e)
                {
                    System.out.println("DB Driver Not Exist!!");
                } catch (SQLException e) {
                    System.out.println("DB ERROR " + e.getMessage());
                }
                break;
            case 4:
                try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                        "h13")) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    connection.setAutoCommit (false);
                    PreparedStatement preparedStatement = connection.prepareStatement("update Students set name =? , year_of_entrance=? ,average_score=? where user_code=? ");
                    System.out.println("enter the replace name :");
                    setStName(scanner.next());
                    preparedStatement.setString(1, getStName());
                    System.out.println("enter the replace year :");
                    setEntYear(scanner.nextInt());
                    preparedStatement.setLong(2, getEntYear());
                    System.out.println("enter the replace average :");
                    setAverage(scanner.nextFloat());
                    preparedStatement.setFloat(3, getAverage());
                    preparedStatement.setLong(4, getStCode());
                    preparedStatement.executeUpdate();
                    System.out.println("are you sure to update all?(y/n)");
                    String option=scanner.next();
                    if (option.equals("y"))
                        System.out.println("your information have been updated !!!");

                    if (option.equals("n")) connection.rollback();
                    connection.commit();
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException e)
                {
                    System.out.println("DB Driver Not Exist!!");
                } catch (SQLException e) {
                    System.out.println("DB ERROR " + e.getMessage());
                }break;
            default:
                System.out.println("wrong answer!!");
        }
    }
}
