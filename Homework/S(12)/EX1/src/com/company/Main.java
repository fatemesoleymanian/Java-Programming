package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("******* hello and welcome dear employees ! *******");
        EmpInfo<String > empInfos=Employee::insert;

        for (int i=0 ; i<5 ; i++)
        {
            System.out.println("employee number" +i+1+" "+"please enter required information");
            System.out.println("your name :  your education :  your age :  your email address :");
            try {
                empInfos.info(scanner.next(),scanner.next(),scanner.next(),scanner.next());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        } System.out.println("tank you for helping us !");

    }
}
