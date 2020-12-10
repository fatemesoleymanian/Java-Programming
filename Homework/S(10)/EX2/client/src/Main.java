
import remote.People;
import remote.PeopleService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            PeopleService peopleService=(PeopleService) Naming.lookup("//localhost/FoodServer");
            System.out.println("welcome to restaurant !\n\t\t*************");
            String address;
            System.out.println("enter your address :");
            address=scanner.nextLine();

            System.out.println("now let's take a look at our menu !\n\n1) hamburger  10,000 toman\t\t2) felafel  9,000 toman\t\t3) soosi bandari  8,000 toman");
            String ans=scanner.next();

            switch (ans)
            {
                case "1":
                    People people=new People(address,"10","hamburger");
                    peopleService.save(people);
                    break;
                case "2":
                    People people1=new People(address,"9","felafel");
                    peopleService.save(people1);
                    break;
                case "3":
                    People people2=new People(address,"8","soosi bandari");
                    peopleService.save(people2);
                    break;


            }System.out.println("saved successfully !/you can pay your bill when you get your food !/n/t/t/t*****good appetite !****");

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
