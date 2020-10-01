package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("choose a subject.");
        System.out.println("1.computer basics.");
        System.out.println("2.computer basics workshop.");
        System.out.println("3.discrete mathematic.");

        int option=scanner.nextInt();
        if(option == 1)
        {
            ComputerBasics info=new ComputerBasics();
            System.out.print("pre_equisiteCourse :");
            info.information2();
            System.out.println("co_equisiteCourse :"+info.getCo_equisiteCourse());
            System.out.println("number of unit is"+" "+info.numberOfUnit);
        }
        else if (option == 2)
        {
            ComputerBasicsWorkshop info=new DiscreteMathematic();
            System.out.print("co_equisiteCourse :");
            info.information1();
            System.out.print("pre_equisiteCourse :");
            info.information3();
            System.out.println("number of unit is"+" "+info.numberOfUnit);
        }
        else if (option == 3)
        {
            DiscreteMathematic info=new DiscreteMathematic();

            System.out.print("co_equisiteCourse :");
            info.information3();
            System.out.print("pre_equisiteCourse :");

            info.information2();
            System.out.println("number of unit is"+" "+info.numberOfUnit);

        }
        else
            return;
    }
}
