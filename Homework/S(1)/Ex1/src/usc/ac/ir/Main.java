package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Square getside=new Square();
        Rectangle get=new Rectangle();
        System.out.println("       SQUARE :");
        System.out.print("Enter the side of square:");
        getside.side=Integer.parseInt(scanner.nextLine());

        System.out.println("The area of square is:"+getside.area());


        System.out.println("The environment of square is:"+getside.env());


        System.out.println("       Rectangle : ");
        System.out.print("Enter the length of rectangle:");
        get.length=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the width of rectangle:");
        get.width=Integer.parseInt(scanner.nextLine());
        System.out.println("The area of rectangle is:"+get.are());

        System.out.println("The environment of rectangle is:"+get.env());
    }
}
