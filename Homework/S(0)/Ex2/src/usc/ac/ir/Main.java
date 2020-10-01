package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("enter the size of your arraye:");
        int size=scanner.nextInt();
        int[] num=new int[size];
        System.out.println("enter the members");
        for (int i=0 ; i<size ; i++ ){
            num[i]=scanner.nextInt();
        }


        int max=0;
        for(int j=0 ; j<size ; j++ ){
            if (num[j]>max)
                max=num[j];
        }
        System.out.println("max is" + max);
    }
}
