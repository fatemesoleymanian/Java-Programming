package usc.ac.ir;

import usc.ac.ir.controller.*;
import usc.ac.ir.model.service.CustomerService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CustomerController customerController=new CustomerController();
        int ans=scanner.nextInt();
        if (ans == 1) customerController.signIn();
        if (ans == 2){
            try {
                customerController.singUp();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("\t1) priad : model 99 : sefid : 100 milion (+ maliat)\n\t2) tiba2 : model 99 : meshki : 97milliono 500(+maliat)");
                ans=scanner.nextInt();
                if (ans == 1){

                    customerController.buyCar1();
                }
                if (ans == 2){
                    customerController.buyCar2();
                }
        }
            else if(ans!= 1 || ans!=2) System.out.println("wrong answer !");

    }
}
