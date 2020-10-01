package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Calculator is ready to calculate... ");

        System.out.println("Please enter a number");

        double a = calculatorScanner.nextDouble();

        System.out.println("Please enter one operator : + , - , * , /");

        String operator = calculatorScanner.next();

        System.out.println("Please enter another number");

        double b = calculatorScanner.nextDouble();

        System.out.println("=");

        switch (operator) {
            case "+":
                Computation sum = new Computation();

                System.out.println(sum.summation(a,b));
                break;
            case "-":
                Computation sub = new Computation();
                System.out.println(sub.subtraction(a, b));

                break;
            case "*":
                Computation mult = new Computation();
                System.out.println(mult.multiplication(a, b));

                break;
            case "/":
                Computation div = new Computation();
                System.out.println(div.division(a, b));

        }




    }
}
