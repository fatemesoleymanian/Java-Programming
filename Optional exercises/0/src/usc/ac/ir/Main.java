package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("please enter the size of 2D arraye:");
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int[][] Nums=new int [r][c];
        int k=1;
        for(int i=0 ; i<r ;i++){
            int j=i;
            for( ;j<c ;j++){
                System.out.print(j+1 +"");
            }if (i>0){
                while(k!=i+1){
                    System.out.print(c);
                    k++;
                }System.out.println("");
                k=1;
            }
            else
                System.out.println("");
        }
    }
}
