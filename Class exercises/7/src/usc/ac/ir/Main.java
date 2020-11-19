package usc.ac.ir;
import usc.ac.ir.controller.UserController;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        UserController userController=new UserController();
        int choice=Integer.parseInt(scanner.nextLine());
        if (choice == 1) userController.logIn();


            if (choice == 2)  userController.registration();
        System.out.println("THANK YOU FOR USE THIS SITE !!!");
    }
}
