package usc.ac.ir.controller;
import usc.ac.ir.model.enyity.*;
import usc.ac.ir.model.repository.CustomerRepo;
import usc.ac.ir.model.service.CustomerService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    Scanner scanner=new Scanner(System.in);
    public CustomerController(){
        System.out.println("welcome to Saipa !!!");
        System.out.println("you can see your car situation if you bought a one by LogIn(1) and buy a new car  by Sign Up(2)");
    }
    public void singUp()throws Exception{
        System.out.println("full name :");
        String name=scanner.next();
        System.out.println("national code :");
        int code=scanner.nextInt();
        System.out.println("password :");
        String pass=scanner.next();
        try (CustomerRepo customerRepo = new CustomerRepo ()) {
            Customerentity customerentity=new Customerentity();
            customerentity.setName (name);
            customerentity.setNationalCode(code);
            customerentity.setPassword(pass);
            customerRepo.insertOwner (customerentity);
            customerRepo.commit ();
        }
    }

    public void signIn(){
        System.out.println("national code :");
        int code=scanner.nextInt();
        try {
            List<Customerentity> customerList = CustomerService.getInstance().report ();
            for (Customerentity personEnti : customerList) {
                System.out.println("your name : "+personEnti.getName());
                System.out.println("your national code : "+personEnti.getNationalCode());
                System.out.println("your password : "+personEnti.getPassword());
                System.out.println("your car : "+personEnti.getCar());
                System.out.println("the color : "+personEnti.getColor());
                System.out.println("the cost : "+personEnti.getCost());
                System.out.println("yhe car situation : "+personEnti.getCarSituation());

            }
        }
        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }

    }
    public void buyCar1(){
        try {
            CustomerService.getInstance ().saveCar1 (new Customerentity ().setCar ("praide").setColor ("sefid").setCost (100).setCarSituation("is reserved by you."));
            System.out.println ("* buying car finished check your car situation later *");
        }
        catch (Exception e){
            System.out.println ("Fail to buye!"+e.getMessage ());
        }


    }
    public void buyCar2(){
        try {
            CustomerService.getInstance ().saveCar2 (new Customerentity ().setCar ("tiba2").setColor ("meshki").setCost (7).setCarSituation("is reserved by you."));
            System.out.println ("* buying car finished check your car situation later *");
        }
        catch (Exception e){
            System.out.println ("Fail to buye!"+e.getMessage ());
        }


    }
}
