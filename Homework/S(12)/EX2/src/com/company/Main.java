package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final String oxford="دانشگاه آکسفورد\nرتبه اول در جهان\t واقع در : انگستان\tسال تاسیس :1906";
       final String harvard="دانشگاه هاروارد\nرتبه سوم در جهان\t واقع در : ایالات متحده آمریکا\tسال تاسیس :1636";
     final String cambridge="دانشگاه کمبریج\nرتبه هفتم در جهان\t واقع در : انگستان\tسال تاسیس :1209";
       final String usc="دانشگاه علم و فرهنگ \nدر رده ۵۰۰ دانشگاه برتر جهان قرار دارد\t واقع در :ایران\tسال تاسیس :1372 /1995";


        University university=new University() {
            @Override
            public void uniInfo() {
                File file = new File("C:\\Uni\\UniversitiesInformation.txt");
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write("gkjjk"+oxford+"\n"+harvard+"\n"+cambridge+"\n"+usc);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace ();
                }


            }
        };
        System.out.println("you can go to this path -> C:\\Uni\\UniversitiesInformation.txt  to see universities information ");




    }
}
