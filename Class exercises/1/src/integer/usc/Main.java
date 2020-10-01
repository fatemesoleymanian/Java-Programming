package integer.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Library Crt=new Library();
        //menu
        System.out.println("Welcome To Library!...");
        System.out.println("Enter Your Name And If You Are Not A Member  Enter 'no'.");
        String creat=scanner.next();
        if (creat.equals("no")){
            System.out.print("Name:");
            Crt.name=scanner.next();
            System.out.print("Family:");
            Crt.family=scanner.next();
            Crt.MemberNo=(int)(Math.random()*101);
            System.out.println(" Your Information Was Registered In System. Your Member-No:"+Crt.MemberNo);

        }
        else {
            Crt.name=creat;
        }
        System.out.println("How Can I help You"+" "+Crt.name+"?");
        System.out.println("1.Borrowing Book.");
        System.out.println("2.Lending Book.");
        System.out.println("3.Turning Back Book.");
        System.out.println("4.Searching Book.");
        int option=scanner.nextInt();

        switch(option) {
            case 1:
                System.out.print("Enter  name of the book: ");
                String Bname = scanner.next();
                Crt.borrow(Bname, Crt.name);
                break;
            case 2:
                System.out.print("Enter  name of the book: ");
                Bname = scanner.next();
                Crt.lend(Bname, Crt.name);
                break;
            case 3:
                System.out.print("Enter  name of the book: ");
                Bname = scanner.next();
                Crt.turnBack(Bname, Crt.name);
                break;
            case 4:
                System.out.print("Enter  name of the book: ");
                Bname = scanner.next();
                Crt.search(Bname);
                break;
            default:
                System.out.println("Oops!...");
                System.out.println("Something Went Wrong... ");


        }
    }
}
