package usc.ac.ir;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class Print extends Student{
    Print(){
        String printt="\t\t\t******Students Services Site******\n";
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);

        File file=new File("E:\\AdvancedProgramming\\Java-Programming\\Homework\\S(6)\\EX3\\StudentReport.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(printt+"student code: "+getStCode()+"\nfull name: "+getStName()+
                    "\nyear of entrance: "+getEntYear()+"\nthe score average: "+getAverage()+"\n\n"+formattedDate);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        System.out.println("go to (E://AdvancedProgramming//Java-Programming//Homework//S(6)//EX3//StudentReport.txt) .");
    }

}

