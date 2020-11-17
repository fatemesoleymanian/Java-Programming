package usc.ac.ir;
import java.io.*;
import java.sql.*;
import java.time.*;
import java.time.format.*;

public class Print extends Student{
    Print() {
        String printt = "\t\t\t******Students Services Site******\n";
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "h13");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Students where user_code=?");
            preparedStatement.setLong(1,getStCode());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                    setStCode(resultSet.getLong("user_code"));
                    setStName(resultSet.getString("name"));
                    setEntYear(resultSet.getInt("year_of_entrance"));
                    setAverage(resultSet.getFloat("average_score"));}


        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
        try {
        FileWriter writer = new FileWriter("StudentReport.txt");
        File file=new File("E:\\AdvancedProgramming\\Java-Programming\\Homework\\S(6)\\EX3\\StudentReport.txt");
                writer.write(printt + "student code: " + getStCode() + "\nfull name: " + getStName() +
                        "\nyear of entrance: " + getEntYear() + "\nthe score average: " + getAverage() + "\n\n" + formattedDate);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace ();
        }


        System.out.println("go to (E://AdvancedProgramming//Java-Programming//Homework//S(6)//EX3//StudentReport.txt) .");}
}

