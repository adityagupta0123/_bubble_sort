package Loops;

import java.util.Scanner;

public class PattenPrimate {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("enter no. to write patten");

        int number = Sc.nextInt();
        int n=1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j<=number-i ; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i ;j++){
                System.out.print(n++ +"   ");
            }
            System.out.println();

        }

    }
}