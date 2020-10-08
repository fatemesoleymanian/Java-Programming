package usc.ac.ir;

import java.util.Scanner;

public class Student {

    Scanner scanner=new Scanner(System.in);

    final static String Name="fateme" ;

    final static String Family="soleymanian";

    final static long Username=981113043;

    final static long Password=31242256;


    public  String name;

    public String family;

    public long username;

    public  long password;


    Student(){
       System.out.println("dear student plz enter your information .");
    }

    static void input()throws Exception{

        Scanner scanner=new Scanner(System.in);
        Student student=new Student();

        System.out.println("Name :");
        student.name = scanner.next();

        System.out.println("Family Name :");
         student.family = scanner.next();

        System.out.println("User Name :");
         student.username = scanner.nextLong();

        System.out.println("Password :");
        student.password = scanner.nextLong();

        if (!Student.Name.equals(student.name)) throw new Exception("Incorrect Name .");

         if (!Student.Family.equals(student.family)) throw new  Exception("Incorrect Family Name .");

         if (Student.Username != student.username) throw new Exception("Incorrect User Name .");

         if (Student.Password != student.password) throw new Exception("Incorrect Password .");

         if (Student.Family.equals(student.family) && Student.Name.equals(student.name) && Student.Username == student.username && Student.Password == student.password )
            throw new Exception("You Log In Successfully .");


    }

 }
