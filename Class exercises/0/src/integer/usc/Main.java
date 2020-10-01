package integer.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("plz enter an arraye:");
        int[] nums=new int[5];
        for (int i=0 ; i<5 ; i++ ){
            nums[i]=scanner.nextInt();
        }
        System.out.println("plz enter an integer:");
        int MyNum=scanner.nextInt();

        boolean plus=true;
        boolean neg=false;
        int count=0;


        for(int j=0 ; j<5 ;j++ ){
            if( nums[j]==MyNum ){
                count++;
            }

        }
        if (count==0)
            System.out.println(neg);
        else{
            System.out.println(plus);
            System.out.print(count+" "+"times");
        }
    }
}
