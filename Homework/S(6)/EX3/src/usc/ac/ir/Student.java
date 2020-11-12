package usc.ac.ir;

import java.sql.*;
import java.util.Scanner;

public class Student {
    Scanner scanner=new Scanner(System.in);
    private long stCode;
    private String stName;
    private int entYear;
    private float average;

    public long getStCode() {
        return stCode;
    }

    public void setStCode(long stCode) {
        this.stCode = stCode;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getEntYear() {
        return entYear;
    }

    public void setEntYear(int entYear) {
        this.entYear = entYear;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
    public void showInfo(){
        System.out.println("here are your information !!");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hanie",
                    "hjh79");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Students where code=?");
            preparedStatement.setLong(1,getStCode());
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("student code: "+resultSet.getLong("code"));
            System.out.println("full name: "+resultSet.getString("name"));
            System.out.println("year of entrance: "+resultSet.getString("year_of_entrance"));
            System.out.println("the score average: "+resultSet.getString("average_score"));


        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }



    }

