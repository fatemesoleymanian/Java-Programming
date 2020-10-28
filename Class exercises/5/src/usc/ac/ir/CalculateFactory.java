package usc.ac.ir;

import java.util.Scanner;

public class CalculateFactory {
    public String input;
    CalculateFactory(){}
    public Calculate getCalculate(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("plz ente - or +");
        input=scanner.next();

        if((this.input).equals("+")){
            return new CalcuPlus();
        }
        if (input.equals("-")){
            return new CalcuMinus();
        }
        if (!input.equals("+") && !input.equals("-")){
            return  null;
        }
        return null;
    }
}
