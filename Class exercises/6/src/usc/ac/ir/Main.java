package usc.ac.ir;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("*****Welcome To Our Site !!!******\n1.Login\t2.Sign Up");

        int choose=scanner.nextInt();

        if(choose == 1){
            UserLogin login=new UserLogin();
            login.getInfo();
            login.showInfo();
        }

        if(choose == 2){
            UserRegistration register=new UserRegistration();
                register.getInfo();
                register.showInfo();
        }

    }
}
