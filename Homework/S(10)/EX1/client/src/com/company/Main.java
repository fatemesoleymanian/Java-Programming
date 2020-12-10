package com.company;

import com.company.remote.User;
import com.company.remote.UserInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            UserInterface userInterface=(UserInterface) Naming.lookup("//localhost/SiteServer");
            System.out.println("welcome to site !\n\t\t*************\n1) sign up  2) sign in to change my info");
            String ans=scanner.next();
            String id,pass;
            boolean result=false;
            System.out.println("enter your id : ");
            id=scanner.next();
            System.out.println("enter your password : ");
            pass=scanner.next();
            User user=new User(id,pass);
            switch (ans)
            {
                case "1":
                    userInterface.save(user);
                    System.out.println("saved successfully !");
                    break;
                case "2":
                    System.out.println("enter the replace password :");
                    String replace=scanner.next();
                     result=userInterface.change(user,replace);
                    if (result==true){
                        System.out.println("changed successfully !");
                    }
                    else System.out.println("not successful to change -_-");

                    break;

            }

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
