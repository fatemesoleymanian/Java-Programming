package usc.ac.ir;

import java.util.Scanner;

public class Users {
    Scanner scanner=new Scanner(System.in);


    public static int  memberOfUsers=2;


       Users(){
           System.out.println(" Users  Profiles :");
       }

        public int age[] = new int[memberOfUsers];

        public String name[] = new String[memberOfUsers];

        public String family[] = new String[memberOfUsers];

        public static String iD[] = new String[memberOfUsers];

        public static String[] password = new String[memberOfUsers];

       static void input() throws Exception{
           Users users=new Users();
           Scanner scanner=new Scanner(System.in);

         for (int i = 0; i < memberOfUsers; i++) {
             System.out.println("------ User" + " " + (i + 1) + " " + "Please Enter Your Profile .");


             System.out.print("Name :");
             users.name[i] = scanner.next();

             System.out.print("Family Name :");
             users.family[i] = scanner.next();

             System.out.print("Age :");
             users.age[i] = scanner.nextInt();

             System.out.print("ID :");
             iD[i] = scanner.next();

             System.out.println("Password :");
             password[i] = scanner.next();

         }
         if (Users.password[0].equals(Users.password[1]) && Users.iD[0].equals(Users.iD[1])){

             throw new Exception("this password  and ID is taken by another user...");}

         else if(Users.password[0].equals(Users.password[1]) || Users.iD[0].equals(Users.iD[1])){

             throw new Exception("this password  or ID is taken by another user...");
         }


         else  throw new Exception("users information saved...");


         }
}
