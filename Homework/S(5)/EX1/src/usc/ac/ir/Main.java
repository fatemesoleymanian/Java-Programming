package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("UserName:");
        String name=scanner.nextLine();

        System.out.print("User Real Name:");
        String realName=scanner.nextLine();

        System.out.print("Password:");
        String password=scanner.nextLine();

        System.out.print("Age:");
        int age=scanner.nextInt();

        System.out.print("Address:");
        String address=scanner.next();

        System.out.print("Phone Number:");
        long phoneNumber=scanner.nextLong();

        System.out.print("Education:");
        String education=scanner.next();

        UserInfo userInfo=new UserInfo().setUserName(name).setUserRealName(realName).setPassword(password).setAge(age).setPhoneNumber(phoneNumber).setAddress(address).setEducation(education);

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
