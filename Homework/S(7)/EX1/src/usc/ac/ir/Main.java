package usc.ac.ir;

import usc.ac.ir.controller.CustomerController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CustomerController customerController=new CustomerController();

        System.out.println("1)logIn \t2)sign up");
        int ans=scanner.nextInt();
        if(ans == 1){
            customerController.signIn();
        }
        if (ans == 2){
            customerController.signUp();
        }

        System.out.println("choose a package .");
        System.out.println("1)2 GigaByte ----> 1000 toman (+ 10% tax)");
        System.out.println("2)4 GigaByte ----> 2000 toman (+ 10% tax)");
        System.out.println("3)10 GigaByte ----> 5000 toman (+ 10% tax)");
        System.out.println("4)25 GigaByte ----> 10000 toman (+ 10% tax)");
        ans=scanner.nextInt();
        switch (ans){
            case 1: customerController.buyp1();
            break;
            case 2:
                customerController.buyp2();
                break;
            case 3:
                customerController.buyp3();
                break;
            case 4:
                customerController.buyp4();
                break;
            default:
                System.out.println("wrong answer");
        }

    }
}
