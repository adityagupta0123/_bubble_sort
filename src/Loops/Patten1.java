package Loops;

import java.util.Scanner;

public class Patten1 {
    public static void main(String[]args){
        Scanner number=new Scanner(System.in);
        System.out.println("enter no. of patten");

        int desgin= number.nextInt();

        for (int i=1;i<=desgin;i++){
            for(int j=1;j<=desgin;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
