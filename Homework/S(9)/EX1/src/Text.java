import javafx.scene.control.Alert;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text extends Thread {

    public Text (){
        System.out.println("this is a thread test to copy a text from mainTxt.txt to mainTxtCopy.txt ! so you can check if it's done after 40 seconds:) !");

    }
    @Override
    public void run(){
        String content="";

        File readableTxt=new File("E:\\AdvancedProgramming\\Java-Programming\\Class exercises\\9\\mainTxt.txt");
        synchronized (this){
            try {
                FileReader myFileReader = new FileReader(readableTxt);
                int asci=myFileReader.read();
                while (asci!=-1){
                    content+=(char)asci;
                    asci=myFileReader.read();

                }

                myFileReader.close();
            } catch ( IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        synchronized (this) {
            File writeableTxt = new File("E:\\AdvancedProgramming\\Java-Programming\\Homework\\S(9)\\EX1\\mainTxtCopy.txt");

            try {
                FileWriter fileWriter = new FileWriter(writeableTxt);
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





