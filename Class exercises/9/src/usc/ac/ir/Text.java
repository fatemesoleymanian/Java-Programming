package usc.ac.ir;

import java.io.*;
import java.util.Scanner;

public class Text  {
    private static Text text=new Text();
   private Text (){
       System.out.println("\n\n\tthis is a thread test to copy a text from mainTxt.txt to mainTxtCopy.txt ! so you can check if it's done after 40 seconds:) !");
    }
    public static Text getInstance(){
       return text;
    }

    public void read() {


        File  myTxt=new File("E:\\AdvancedProgramming\\Java-Programming\\Class exercises\\9\\mainTxt.txt");
            synchronized (this){
            try {
                FileReader myFileReader = new FileReader(myTxt);
                int asci=myFileReader.read();
                while (asci!=-1){
                    content+=(char)asci;
                    asci=myFileReader.read();

                }

                myFileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}

    }
    static String content="";



    public void write() {

        synchronized (this) {
            File myTxt = new File("E:\\AdvancedProgramming\\Java-Programming\\Class exercises\\9\\mainTxtCopy.txt");

            try {
                FileWriter fileWriter = new FileWriter(myTxt);
                fileWriter.write(content);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(40000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
