package usc.ac.ir.controller;
import usc.ac.ir.model.entity.CustomerEntity;
import usc.ac.ir.model.service.CustomerService;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    Scanner scanner=new Scanner(System.in);
    public CustomerController(){
        System.out.println("Welcome to site !!!\nyou can check your bills and net packs you bought by entering your account !");
    }
    String usrnm;
    long pss;
    public void signUp(){
        System.out.println("user name :");
         usrnm=scanner.next();
        System.out.println("password :");
         pss=scanner.nextLong();

        try {
            CustomerService.getInstance ().saving (new CustomerEntity ().setUser_name (usrnm).setPassword (pss).setBill(0).setLocal_traffic("0 GigaByte"));
            System.out.println ("saved successfully");

        }catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }}
        public void signIn(){
            System.out.println("user name :");
            String usrnm=scanner.next();
            System.out.println("password :");
            long pss=scanner.nextLong();
            try {
                List<CustomerEntity> customerEntityListList = CustomerService.getInstance().reporting (usrnm,pss);
                for (CustomerEntity customerEntity : customerEntityListList) {
                    System.out.println("your user name : "+customerEntity.getUser_name());
                    System.out.println("your password : "+customerEntity.getPassword());
                    System.out.println("your bill : "+customerEntity.getBill());
                    System.out.println("your Current traffic volume : "+customerEntity.getLocal_traffic());
                }
            }
            catch (Exception e){
                System.out.println ("Fail to report!"+e.getMessage ());
            }
        } public void buyp1(){
        try {
            CustomerService.getInstance().edit(new CustomerEntity().setBill(1000).setLocal_traffic("2 GigaByte").setUser_name(usrnm).setPassword(pss));
            System.out.println("package one has been bought for you !");
        }catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }

    }
    public void buyp2(){
        try {
            CustomerService.getInstance().edit(new CustomerEntity().setBill(2000).setLocal_traffic("4 GigaByte").setUser_name(usrnm).setPassword(pss));
            System.out.println("package two has been bought for you !");
        }catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }

    }
    public void buyp3(){
        try {
            CustomerService.getInstance().edit(new CustomerEntity().setBill(5000).setLocal_traffic("10 GigaByte").setUser_name(usrnm).setPassword(pss));
            System.out.println("package three has been bought for you !");
        }catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }

    }
    public void buyp4(){
        try {
            CustomerService.getInstance().edit(new CustomerEntity().setBill(10000).setLocal_traffic("25 GigaByte").setUser_name(usrnm).setPassword(pss));
            System.out.println("package four has been bought for you !");
        }catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }

    }
}
