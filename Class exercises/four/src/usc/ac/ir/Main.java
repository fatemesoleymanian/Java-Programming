package usc.ac.ir;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        PersonInformation information=new PersonInformation();

        System.out.println("Name :");
        information.setName(scanner.next());

        System.out.println("Family :");
        information.setFamily(scanner.next());

        System.out.println("User Name :");
        information.setUsername(scanner.next());

        System.out.println("Password :");
        information.setPassword(scanner.nextDouble());

        System.out.println("Age :");
        information.setAge(scanner.nextInt());

        System.out.println("Job :");
        information.setJob(scanner.next());

        Map<String,String> informationList=new HashMap<>();
        informationList.put("Name",information.getName());
        informationList.put("Family",information.getFamily());
        informationList.put("User Name",information.getUsername());
        informationList.put("Password", String.valueOf(information.getPassword()));
        informationList.put("Age", String.valueOf(information.getAge()));
        informationList.put("Job",information.getJob());

        System.out.println("Your Information Has Been Saved...\nif you want to take a look at it press 1 and if you don't press 0");
        int answer=scanner.nextInt();
        if (answer == 1){
           Collection vset= informationList.values();
            for (Object o:vset) {
                System.out.println(o);

            }
        }

    }
}
