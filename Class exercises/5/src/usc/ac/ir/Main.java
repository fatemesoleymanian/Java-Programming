package usc.ac.ir;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("calculator is ready to use.");

        CalculateFactory calculateFactory=new CalculateFactory();
        Calculate calculate=calculateFactory.getCalculate();
        calculate.calculation();







    }
}
