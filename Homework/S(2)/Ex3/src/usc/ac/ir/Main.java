package usc.ac.ir;

import java.util.Scanner;

public class Main extends Integer{

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter an integer .");

        newInt=scanner.nextInt();

        MyInteger integer=new Integer();

        System.out.println("this integer is :");

        integer.isEven(newInt);
        integer.isOdd(newInt);

        integer.isNegative(newInt);
        integer.isPositive(newInt);

        integer.isZero(newInt);




    }
}
