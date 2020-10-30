package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("UserName:\t\t");


        System.out.print("User Real Name:\t\t");


        System.out.print("Password:\t\t");


        System.out.print("Age:\t\t");
        System.out.print("Address:\t\t");

        System.out.print("Phone Number:\t\t");

        System.out.print("Education:\n");


        UserInfo userInfo=new UserInfo().setUserName(scanner.nextLine()).setUserRealName(scanner.nextLine()).setPassword(scanner.nextLine()).setAge(scanner.nextInt()).setPhoneNumber(scanner.nextLong()).setAddress(scanner.next()).setEducation(scanner.next());

        System.out.println("Information Saved . . .");

        System.out.print("UserName:");
        System.out.println(userInfo.getUserName());

        System.out.print("User Real Name:");
        System.out.println(userInfo.getUserRealName());

        System.out.print("Password:");
        System.out.println(userInfo.getPassword());

        System.out.print("Age:");
        System.out.println(userInfo.getAge());

        System.out.print("Address:");
        System.out.println(userInfo.getAddress());

        System.out.print("Phone Number:");
        System.out.println(userInfo.getPhoneNumber());

        System.out.print("Education:");
        System.out.println(userInfo.getEducation());


    }
}
