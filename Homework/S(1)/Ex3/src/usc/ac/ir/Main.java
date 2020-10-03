package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);

        System.out.println("plz enter zarib X & Y in 'Cx + Dy = f'");
        Equation eq=new Equation();
        eq.zx1=Integer.parseInt(scanner.nextLine());
        eq.zy1=Integer.parseInt(scanner.nextLine());
        System.out.println("plz enter zarib X & Y in 'Ax + By = e'");
        eq.zx2=Integer.parseInt(scanner.nextLine());
        eq.zy2=Integer.parseInt(scanner.nextLine());
        System.out.println("plz enter numbers e & f in both mathematic equations");
        eq.f=Integer.parseInt(scanner.nextLine());
        eq.e=Integer.parseInt(scanner.nextLine());


        try {
            eq.answer();
        }catch (ArithmeticException e){
            System.out.println(Exceptionfactory.ExceptionHandling(e));
        }


    }
}
