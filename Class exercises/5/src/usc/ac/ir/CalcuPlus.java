package usc.ac.ir;

import java.util.Scanner;

public class CalcuPlus extends Calculate {
    public int[] input=new int[2];
    @Override
    public void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pz enter 2 number");

        for (int i=0 ;i<2;i++ ) {
            input[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("="+Math.abs(input[0]+input[1]));

    }
}
