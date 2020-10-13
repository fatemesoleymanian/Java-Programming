package usc.ac.ir;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,String>studentInformation=new HashMap<>();
        System.out.println("dear student plz enter your information .");
        System.out.print(" Name :");
        studentInformation.put("name", scanner.next());
        System.out.println("Family :");
        studentInformation.put("family",scanner.next());
        System.out.print("Student Number :");
        studentInformation.put("student number", scanner.next());
        System.out.print("Total Average :");
        studentInformation.put("total average",scanner.next());
        System.out.println(studentInformation);

    }
}
