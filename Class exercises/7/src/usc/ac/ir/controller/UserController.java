package usc.ac.ir.controller;
import usc.ac.ir.model.entity.UserEntity;
import usc.ac.ir.model.repository.UserRepo;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class UserController {
    Scanner scanner=new Scanner(System.in);
     public UserController(){
        System.out.println("****welcome to our site !!! ****\nto use our services you have to have an account." +
                "\n1.Login\t\t2.Sign up");
    }
        public void registration(){
            System.out.println("user name :");
            String userName=scanner.next();
            System.out.println("name :");
            String name=scanner.next();
            System.out.println("password :");
            long password=scanner.nextLong();
            System.out.println("email address :");
            String email=scanner.next();
        try {
            UserRepo userRepo=new UserRepo();
            userRepo.inserting(new UserEntity ().setUser_name (userName).setName (name).setPassword (password).setEmail(email));
            System.out.println("are you sure to save?(y/n)");
            String ans=scanner.next();
            if (ans.equals("y") || ans.equals("Y")) {userRepo.commit(); userRepo.close();System.out.println ("saved successfully");}
            if (ans.equals("n") || ans.equals("N")){userRepo.rollback(); userRepo.close();
                System.out.println("You don't have an account .");}

    }
        catch (Exception e){
        System.out.println ("Fail to save!"+e.getMessage ());
    }}
    public void logIn(){
        System.out.println("user name :");
        String usrnm=scanner.next();
        System.out.println("password :");
        long pss=scanner.nextLong();

        try {
            UserRepo userRepo=new UserRepo();
            List<UserEntity> userList = userRepo.selecting(usrnm,pss);
            for (UserEntity userEntity : userList) {
                System.out.println("your user name : "+userEntity.getUser_name());
                System.out.println("your name : "+userEntity.getName());
                System.out.println("your password : "+userEntity.getPassword());
                System.out.println("your email address : "+userEntity.getEmail());
            }
        }
        catch (Exception e){
            System.out.println ("Fail to login !"+e.getMessage ());
        }
    }
}
