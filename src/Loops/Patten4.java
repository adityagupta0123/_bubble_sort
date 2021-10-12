package Loops;

import Userinput.ScannerSc;

import java.util.Scanner;

public class Patten4 {
    public static void main(String[]args){
        Scanner Sc =new Scanner(System.in);

        System.out.println("enter no. to write pattern");

        int number = Sc.nextInt();

        for (int i =1;i<=number;i++){

            for(int j=1;j<=number-i+1;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
