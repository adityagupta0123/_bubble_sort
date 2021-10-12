package Loops;

import java.util.Scanner;

public class Patten3 {
    public static void main(String[]args){
        Scanner number = new Scanner(System.in);

        System.out.println("enter no. to patten");

        int dig = number.nextInt();

        for(int i=1;i<=dig;i++){

            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=dig-i+1;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
