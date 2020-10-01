package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("plz enter 2 numbers");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        float c;

        if( a>b )
            c=a/b;
        else
            c=b/a;

        System.out.println("choose one:1.Summation 2.Distance 3.Multiplication 4.Division");
        int option=scanner.nextInt();

        switch(option){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(Math.abs(b-a));
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(c);

        }
    }
}
