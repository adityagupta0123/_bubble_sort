package Loops;

import java.util.Scanner;

public class Patten2 {
    public static void main(String[]args){
        Scanner number = new Scanner(System.in);

        System.out.println("enter no. to patten");

        int digin = number.nextInt();

        for(int i=1;i<=digin;i++){

            for (int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }


    }
}
