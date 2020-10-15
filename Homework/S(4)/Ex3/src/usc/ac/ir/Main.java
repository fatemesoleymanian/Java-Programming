package usc.ac.ir;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        StudentInfo<String,Long,String> studentInfo=new StudentInfo<>();
        System.out.println("full name :");
        studentInfo.setFullname(scanner.nextLine());

        System.out.println("student number :");

        try {
            studentInfo.setStudentnumber(scanner.nextLong());
        }catch (InputMismatchException e){
            System.out.println("!!!Student Number Includes Numbers !...");

            e.printStackTrace();
            return;

        }

        System.out.println("father name :");
        studentInfo.setFathername(scanner.next());

        List<Float> scoreList=new ArrayList<>();
        try {
            System.out.println("plz enter Math 2 score:");
            scoreList.add(scanner.nextFloat());

            System.out.println("plz enter Advanced Programming score:");
            scoreList.add(scanner.nextFloat());

            System.out.println("plz enter Advanced Programming Workshop score:");
            scoreList.add(scanner.nextFloat());

            System.out.println("plz enter Discrete Mathematic score:");
            scoreList.add(scanner.nextFloat());

            System.out.println("plz enter Logic Circuit score:");
            scoreList.add(scanner.nextFloat());
        }catch (InputMismatchException e){
            System.out.println("!!!Scores Include Numbers!!!!..");
            e.printStackTrace();
            return;
        }
        ;
        System.out.println("your"+" "+Info.Full_Name+":");
        System.out.println(studentInfo.getFullname());

        System.out.println("your "+" "+Info.Student_Number+":");
        System.out.println(studentInfo.getStudentnumber());

        System.out.println("your"+" "+Info.Father_Name+ ":");
        System.out.println(studentInfo.getFathername());

        System.out.println("your"+" "+ Info.Scores+" :");
        System.out.println(scoreList);




    }
}
