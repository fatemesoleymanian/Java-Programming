package usc.ac.ir;


import java.util.Scanner;

public class Main  {

    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.println("\t\t\t******Students Services Site******");
        System.out.println("dear student please choose one\n\t\t1.Registration of information for new students\n\t\t2.delete students information\n\t\t3.update students information");
        int ans=Integer.parseInt(scanner.nextLine());

        switch (ans)
        {
            case 1:
                Registration registration=new Registration();
                registration.getInfo();
                student.showInfo();

                break;
            case 2:
                Delete delete=new Delete();
                delete.deleting();
                student.showInfo();
                break;
            case 3:
                Update update=new Update();
                update.updating();
                student.showInfo();
                break;
            default:
                System.out.println("wrong answer!!");


        }

        System.out.println("\n\n\t\t1.print this page\t\t\t2.leave this site");
        ans=Integer.parseInt(scanner.nextLine());

        if (ans == 1) {
            Print print = new Print();
        }

            else if (ans==2) return;
            else System.out.println("wrong answer.");

    }
}
