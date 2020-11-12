package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("welcome to employees's services site !\nwhat do you desire ?\n");
        System.out.println("\t\t1.entering your information and sign up in site\n\t\t2.delete your information from site");

        int answer=Integer.parseInt(scanner.nextLine());

        Employees employees=new EmployeesInfo();

        switch (answer)
        {
            case 1:
                employees.getInfo();
                employees.showInfo();
                break;
            case 2:
                employees.deleteInfo();
                employees.showInfo();

        }

    }
    }

