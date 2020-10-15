package usc.ac.ir;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        UserInformation<String,String ,String > user1=new UserInformation<>();


        System.out.print("Email Address :");
        user1.email=s.next();

        System.out.print("Username :");
        user1.username=s.next();

        System.out.print("Password :");
        user1.password=s.next();

        UserInformation<String,String ,String> user2=null;
        UserInformation<String,String ,String> user3=null;

        try {

            user2= (UserInformation) user1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Clone Not Supported...!");
        }
        try {

            user3= (UserInformation) user2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Clone Not Supported...!");
        }

        System.out.print("Your Email Address :");
        System.out.println(user1.email);

        System.out.print("Your Username :");
        System.out.println(user2.username);

        System.out.print("Password :");
        System.out.println(user3.password);



    }
}
