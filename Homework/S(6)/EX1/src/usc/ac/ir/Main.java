package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UserServises user=new UserServises();
        System.out.println("********************Welcome To site********************");
        System.out.println("\t\t\t1.sign up\t\t\t2.update your account");
        int chs=Integer.parseInt(scanner.nextLine());
        switch (chs)
        {
            case 1:
                user.signUp();

                break;
            case 2:
                user.update();
        }user.showInfo();

    }
}
