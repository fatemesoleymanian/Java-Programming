package usc.ac.ir;

import java.util.Scanner;
import java.util.concurrent.Callable;


public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        CheckString checkString=new CheckString();

        String string=scanner.next();

        CheckString.getString(string);


    }
}
