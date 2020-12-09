package src;


import src.BankRemote.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        try {
            BankService personService = (BankService) Naming.lookup("//localhost/Bank");
            Client person = new Client();
            System.out.println("enter your account number :");
            person.setAccNum(scanner.next());

            System.out.println("enter your password :");
            person.setPassword(scanner.next());

            System.out.println("how much do you want to transfer ?");
            String amount=scanner.next();

            System.out.println("the receiver account number :");
            String reciever=scanner.next();

            personService.update(person,amount,reciever);


            System.out.print("your account balance: "+personService.show(person));


        } catch (RemoteException e) {
            e.printStackTrace ();
        } catch (NotBoundException e) {
            e.printStackTrace ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}
