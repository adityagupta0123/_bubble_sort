package Loops;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[]args){
        Scanner fact = new Scanner(System.in);

        int sum =0;
        System.out.println("enter number:");
        int Number= fact.nextInt();

        for(int i=1;i<=Number;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
