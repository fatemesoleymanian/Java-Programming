package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ArithmeticException {

        Scanner scanner=new Scanner(System.in);
        SecondDegreeEquation secondDegreeEquation=new SecondDegreeEquation();

        System.out.println("A :");
        secondDegreeEquation.setA(scanner.nextFloat());

        System.out.println("B :");
        secondDegreeEquation.setB(scanner.nextFloat());

        System.out.println("C :");
        secondDegreeEquation.setC(scanner.nextFloat());

        secondDegreeEquation.answer();



    }
}
