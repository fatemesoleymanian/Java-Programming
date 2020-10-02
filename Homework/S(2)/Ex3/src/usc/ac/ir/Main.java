package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter an integer .");

        Integer.newInt=scanner.nextInt();

        MyInteger integer=new Integer();

        System.out.println("this integer is :");

        integer.isEven(Integer.newInt);
        integer.isOdd(Integer.newInt);

        integer.isNegative(Integer.newInt);
        integer.isPositive(Integer.newInt);

        integer.isZero(Integer.newInt);




    }
}
