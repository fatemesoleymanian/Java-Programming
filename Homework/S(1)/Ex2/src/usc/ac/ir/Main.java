package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter grade of math and its zarib");
        Subject get=new Subject();
        get.math=scanner.nextFloat();
        get.zMath=scanner.nextInt();
        System.out.print("enter grade of logic circuit and its zarib");
        get.logicCircuit=scanner.nextFloat();
        get.zLogicCircuit=scanner.nextInt();
        System.out.print("enter grade of technical language and its zarib");
        get.technicLngu=scanner.nextFloat();
        get.zTechnicLngu=scanner.nextInt();
        System.out.print("enter grade of advanced programming and its zarib");
        get.advnProgram=scanner.nextFloat();
        get.zAdvnProgram=scanner.nextInt();
        float sum=(get.math * get.zMath)+(get.logicCircuit * get.zLogicCircuit)+(get.advnProgram *get.zAdvnProgram)+(get.technicLngu *get.zTechnicLngu);
        int tedad=get.zAdvnProgram + get.zTechnicLngu + get.zLogicCircuit + get.zMath;
        get.avrg(sum,tedad);

    }
}
