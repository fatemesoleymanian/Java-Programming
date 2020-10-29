package usc.ac.ir;

import java.util.Scanner;

public class UserRegister {
    Scanner scanner=new Scanner(System.in);
    private  static UserRegister register=new UserRegister();

    public static UserRegister getInstance(){return register;}

    private UserRegister(){}
    String email;
    String userName;
    String password;

    public int introduction(){
        System.out.println("******hello and thank you for using this site !*****");
        System.out.println("to use this site you need to register .\n\t\t1. ok,I want to register.\t\t\t2. maybe later");
        int answer=scanner.nextInt();
        return answer;

    }
    public int logIn(){
        System.out.println("enter required information . ");

        System.out.println("choose a user name(it's shown to other users)");
        userName=scanner.next();
        System.out.println("enter your email");
        email=scanner.next();
        System.out.println("enter the password");
        password=scanner.next();
        System.out.println("SUBMIT ?");
        String answer=scanner.next();
        if (answer.equals("SUBMIT") ||answer.equals("Submit") || answer.equals("submit") || answer.equals("YES") || answer.equals("yes") || answer.equals("Y") || answer.equals("y"))
        {
            System.out.println("your ID "+Math.random());
            return 1;
        }
        else return 0;

    }
    public void moveToSite(){
        System.out.println("dear "+userName+" "+"this site is ready to serve ! :)");

    }


}
