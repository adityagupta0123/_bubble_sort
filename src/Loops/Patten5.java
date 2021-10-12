package Loops;

import java.util.Scanner;

public class Patten5 {
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);

        System.out.println("enter no. to write patten");

        int number=Sc.nextInt();
        for(int j=1;j<=number;j++){

            for(int i=1;i<=number-j;i++){
                System.out.print("  ");
            }
            //for(int i=number-j;i>1;i--){

            for(int i=1;i<=j;i++){
                System.out.print("# ");
            }

            System.out.println();
        }
    }
}
