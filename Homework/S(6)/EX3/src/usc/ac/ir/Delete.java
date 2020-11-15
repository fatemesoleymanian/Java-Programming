package usc.ac.ir;
import java.sql.*;
import java.util.Scanner;
public class Delete extends Student {
    Scanner scanner = new Scanner(System.in);

    Delete() {
        System.out.println("to enter your page enter your student code .");
    }


    public void showInfo() {
        super.showInfo();
    }

    public void deleting() {
        System.out.println("code :");
        setStCode(scanner.nextLong());

        super.showInfo();

        System.out.println("WHICH ONE DO YOU WANT TO DELETE ?");
        System.out.println("1.your name\n2.the year of your entrance\n3.average of your scores\n4.all");
        int ans = scanner.nextInt();

        switch (ans) {
            case 1:

                try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                        "h13")) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    connection.setAutoCommit (false);
                    PreparedStatement preparedStatement = connection.prepareStatement(" UPDATE Students SET  Name = Null where user_code=? ");
                    preparedStatement.setLong(1, getStCode());
                    preparedStatement.executeUpdate();
                    System.out.println("are you sure to delete?(y/n)");
                    String option=scanner.next();
                    if (option.equals("y"))
                        System.out.println("your name has been deleted!!");

                    if (option.equals("n")) connection.rollback();
                    connection.commit();
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException e)// if no lib files are added
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
                    PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Students SET  year_of_entrance= Null where user_code=? ");

                    preparedStatement.setLong(1, getStCode());
                    preparedStatement.executeUpdate();
                    System.out.println("are you sure to delete?(y/n)");
                    String option=scanner.next();
                    if (option.equals("y"))
                    System.out.println("the year of your entrance has been deleted!!");

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
                    PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Students SET  average_score = Null where user_code=? ");
                    preparedStatement.setLong(1, getStCode());
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
                    PreparedStatement preparedStatement = connection.prepareStatement("delete from Students where user_code=? ");
                    preparedStatement.setLong(1, getStCode());
                    preparedStatement.executeUpdate();
                    System.out.println("are you sure to delete?(y/n)");
                    String option=scanner.next();
                    if (option.equals("y"))
                        System.out.println("your information have been deleted!!");

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

