package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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



        eq.answer();
        eq.x=((eq.e * eq.zy1) -(eq.zy2*eq.f))/((eq.zx2*eq.zy1)-(eq.zy2*eq.zx1));
        eq.y=((eq.f*eq.zx2)-(eq.e*eq.zx1))/((eq.zx2*eq.zy1)-(eq.zy2*eq.zx1));

    }
}
