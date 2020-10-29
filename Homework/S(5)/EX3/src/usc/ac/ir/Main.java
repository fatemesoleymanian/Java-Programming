package usc.ac.ir;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t\t\t*****CAR FACTORIES****");
        System.out.println("to see Technical specifications of the cars choose the brand you wan.");
        System.out.println("1.Toyota\n2.BMW\n3.Mercedes Benz");
        int choose=Integer.parseInt(scanner.nextLine());

	CarFactory carFactory=new CarFactory();
       Car car=carFactory.getCar(choose);
       car.acceleration();
       car.differentialNumber();
       car.differetialType();
       car.enginePower();
    }
}
