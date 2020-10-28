package usc.ac.ir;


import java.util.Scanner;

public class CalcuMinus extends Calculate{
    public int[] input=new int[2];
    @Override
    public void  calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pz enter 2 number");


        input[0]=Integer.parseInt(scanner.nextLine());
        input[1]=Integer.parseInt(scanner.nextLine());



        System.out.println("="+Math.abs(input[1] - input[0]));

    }
}
